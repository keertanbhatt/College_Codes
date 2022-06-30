//modify.html
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

/**
 *
 * @author Parth
 */
public class Servlet23 extends HttpServlet {

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
            String p = request.getParameter("pen");
            String f = request.getParameter("fname");
            String l = request.getParameter("lname");
            String s = request.getParameter("sem");
            String n = request.getParameter("number");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Modify Records</title>");
            out.println("</head>");

            Class.forName(JDBC_DRIVER);
            System.out.println("connecting Database");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully");
            stmt = (Statement) conn.createStatement();

            String sql = "UPDATE `registration` SET " + "`pen`=" + p + " `fname`=" + f + " `lname`= " + l + " `sem`=" + s + " `number`=" + n + " where pen=" + p + "";
//UPDATE `registration` SET `pen`='190840131006',`fname`='Keertan',`lname`='Bhatt',`sem`='6',`number`='9897156422' WHERE pen = 190840131006;
            out.println("<body>");
            out.println("1");
            stmt.execute(sql);
            int i = stmt.executeUpdate(sql);
            out.println("2");

            out.println("" + i + " Record Successfully Udated");
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
