//Search.html
package Servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Parth
 */
public class Servlet21 extends HttpServlet {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/practical3";
    static final String USER = "root";
    static final String PASS = "root";
    Connection conn = null;
    Statement stmt = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Pen, p, fn, ln, s, mn;
            Pen = request.getParameter("pen");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>servlet1</title>");
            out.println("</head>");
            out.println("<body");
            Class.forName(JDBC_DRIVER);
            System.out.println("connecting Database");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully");
            stmt = (Statement) conn.createStatement();
            String sql = ("select * from registration where pen=" + Pen + "");
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                p = rs.getString("pen");
                fn = rs.getString("fname");
                ln = rs.getString("lname");
                s = rs.getString("sem");
                mn = rs.getString("number");
                out.println("<p>Enrollment Number Is:" + p + "<br/>" + "First Name Is:" + fn + "<br/>" + "Last Name Is:" + ln + "<br/>" + "Semester Is:" + s + "<br/>" + "Mobile Number Is: " + mn + " <br/> ");
            }
            out.println("</body>");
            out.println("</html>");
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
