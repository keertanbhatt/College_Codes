
package Servlet4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.xml.parsers.*;
import java.io.*;
import java.sql.ResultSet;
import org.w3c.dom.Document;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Servlet4 extends HttpServlet {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/prac_3";
    static final String USER = "root";
    static final String PASS = "";
    Connection conn = null;
    Statement stmt = null;

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Pen, p, fn, ln, s, mn;
            Pen = request.getParameter("pen");
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = f.newDocumentBuilder();
            Document doc = b.newDocument();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>servlet1</title>");
            out.println("</head>");
            out.println("<body");
            Class.forName(JDBC_DRIVER);
            out.println("connecting Database");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            out.println("Connected database successfully");
            stmt = (Statement) conn.createStatement();
            String sql = ("select * from registration where pen=" + Pen + "");
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                p = rs.getString("pen");
                fn = rs.getString("fname");
                ln = rs.getString("lname");
                s = rs.getString("sem");
                mn = rs.getString("number");
                out.println("<h1>Done Till Here</h1>");
                Element rootele = doc.createElement("Students");
                Element studentele = doc.createElement("Student");
                Element penele = doc.createElement("PEN");
                Element fnele = doc.createElement("FirstName");
                Element lnele = doc.createElement("LastName");
                Element sele = doc.createElement("Semester");
                Element mnele = doc.createElement("MobileNumber");
                Text t1 = doc.createTextNode(p);
                Text t2 = doc.createTextNode(fn);
                Text t3 = doc.createTextNode(ln);
                Text t4 = doc.createTextNode(s);
                Text t5 = doc.createTextNode(mn);
                penele.appendChild(t1);
                fnele.appendChild(t2);
                lnele.appendChild(t3);
                sele.appendChild(t4);
                mnele.appendChild(t5);
                studentele.appendChild(penele);
                studentele.appendChild(fnele);
                studentele.appendChild(lnele);
                studentele.appendChild(sele);
                studentele.appendChild(mnele);
                rootele.appendChild(studentele);
                doc.appendChild(rootele);
                Transformer t = TransformerFactory.newInstance().newTransformer();
                t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("C:/Users/Keertan.bhatt/Desktop/CSE_19/SEM-6/PRACTICAL/AJP/PRACTICAL-3/pr-3.4/students.xml")));
                System.out.println("XML File Generated");
                out.println("<h1>Done Till Here</h1>");
            }
            String XSLFILE = "C:/Users/Keertan.bhatt/Desktop/CSE_19/SEM-6/PRACTICAL/AJP/AJP-20220421T043238Z-001/AJP/practical-3/practical_3_4/studentstyle.xsl";
            String INFILE = "C:/Users/Keertan.bhatt/Desktop/CSE_19/SEM-6/PRACTICAL/AJP/AJP-20220421T043238Z-001/AJP/practical-3/practical_3_4/students.xml";
            String OUTFILE = "C:/Users/Keertan.bhatt/Desktop/CSE_19/SEM-6/PRACTICAL/AJP/AJP-20220421T043238Z-001/AJP/practical-3/practical_3_4/studentsfinal.xml";

            StreamSource stylesource = new StreamSource(new File(XSLFILE));
            StreamSource source = new StreamSource(new File(INFILE));
            StreamResult result = new StreamResult(new File(OUTFILE));
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer(stylesource);
            trans.transform(source, result);
            System.out.println("XSL is also generated");
            out.println("</body>");
            out.println("</html>");
        }catch (ClassNotFoundException | SQLException | IOException e) {
            System.out.println(e);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Servlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(Servlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Servlet4.class.getName()).log(Level.SEVERE, null, ex);
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
