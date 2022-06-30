
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Dispatch;

/**
 *
 * @author Parth
 */
public class loginval extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = (String) request.getParameter("uname");
        String password = (String) request.getParameter("pass");
        if (password.equals("1234")) {
            ArrayList cart = new ArrayList();
            int totalcost = 0;
            HttpSession mysession = request.getSession();
            mysession.setAttribute("user", username);
            mysession.setAttribute("itemlist", cart);
            mysession.setAttribute("total", totalcost);
            response.sendRedirect("Shop.jsp");
        } else {
            response.sendRedirect("Error.jsp");
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
