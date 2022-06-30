package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Shopping Cart - Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"img/background.jpg\"><center>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"headbanner\">\n");
      out.write("                    <h1>\n");
      out.write("                        <center>\n");
      out.write("                            <img src=\"img/shopping.jpg\" />[My Shopping Cart]\n");
      out.write("                        </center>\n");
      out.write("                    </h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mycontent\">\n");
      out.write("                    <div class=\"space\"><span><a class=\"formtext\">Login</a></span></div>\n");
      out.write("                    <div class=\"formcontent\">\n");
      out.write("                        <form action=\"loginval\" method=\"post\">\n");
      out.write("                            <table border=\"2px\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"formtext\">Username :</td>\n");
      out.write("                                    <td><input id=\"name\" name=\"uname\" type=\"text\" size=\"30\" /></td><td><a>[Any name]</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"formtext\">Password :</td>\n");
      out.write("                                    <td><input id=\"pas\" name=\"pass\" type=\"password\" size=\"30\" /></td><td><a>[Pass = 1234]</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\"><center> <input type=\"submit\" value=\"Submit\"/></td></center>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
