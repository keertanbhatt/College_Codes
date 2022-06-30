package Servlet5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/prac_3";
    static final String USER = "root";
    static final String PASS = "";
    Connection conn = null;
    Statement stmt = null;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String P, F, L, S;
            P = request.getParameter("i");
            F = request.getParameter("n");
            L = request.getParameter("e");
            S = request.getParameter("a");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>servlet1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Employee ID Is:" + P + "<br/>" + "Employee Name Is:" + F + "<br/>" + "Employee E-Mail Is:" + L + "<br/>" + "Employee Age Is:" + S + "<br/>");

            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting To Database");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected To Database Successfully");
            stmt = (Statement) conn.createStatement();
            String sql = "insert into employee(id,name,email,age) values ('" + P + "','" + F + "','" + L + "','" + S + "')";
            stmt.execute(sql);
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException | SQLException | IOException e) {
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
