package Servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet_2 extends HttpServlet {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/practical3";
    static final String USER = "root";
    static final String PASS = "root";
    Connection conn = null;
    Statement stmt = null;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String P, F, L, S, N;
            P = request.getParameter("pen");
            F = request.getParameter("fname");
            L = request.getParameter("lname");
            S = request.getParameter("sem");
            N = request.getParameter("number");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>servlet1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Enrollment Number Is: " + P + "<br/>" + "First Name Is: " + F + "<br/>" + "Last Name Is: " + L + "<br/>" + "Semester Is: " + S + "<br/>" + "Mobile Number Is: " + N + " <br/>");
            out.println("</body>");
            out.println("</html>");

            Class.forName(JDBC_DRIVER);
            System.out.println("connecting Database");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully");
            stmt = (Statement) conn.createStatement();

            String sql = "insert into registration(pen,fname,lname,sem,number) values ('" + P + "','" + F + "','" + L + "','" + S + "','" + N + "')";
            stmt.execute(sql);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
