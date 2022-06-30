package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import classes.Item;

public final class Shop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        ");

            String user = (String) session.getAttribute("user");
            if (user == null) {
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Shopping Cart - Shop</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #EDE6DB\"><center>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"requesthandle\" method=\"post\">\n");
      out.write("                    <div class=\"headbanner\">\n");
      out.write("                        <h1>\n");
      out.write("                            <center>\n");
      out.write("                                <img src=\"img/shopping_1.png\" />[My Shopping Cart]\n");
      out.write("                            </center>\n");
      out.write("                        </h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mycontent\">\n");
      out.write("                        <div class=\"cartof\">\n");
      out.write("                            <center><a>Cart Of [");
 out.print(session.getAttribute("user"));
      out.write("]<input name=\"logout\" type=\"submit\" value=\"Logout\"></input></a></center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cartcontent\">\n");
      out.write("                            <div class=\"myitems\">\n");
      out.write("                                <table width=\"600px\" cellpadding=\"0\" cellspacing=\"0\" border=\"2px\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>#id</th>\n");
      out.write("                                        <th>Item</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Action</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
if (session.getAttribute("itemlist") != null) {
                                            ArrayList mycart = (ArrayList) session.getAttribute("itemlist");
                                            for (int i = 0; i < mycart.size(); i++) {
                                                Item it = (Item) mycart.get(i);
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td align=\"center\">");
out.print(i);
      out.write("</td>\n");
      out.write("                                        <td align=\"center\">");
 out.print(it.name);
      out.write("</td>\n");
      out.write("                                        <td align=\"center\">");
 out.print(it.price);
      out.write("</td>\n");
      out.write("                                        <td align=\"center\"><input name=\"del\" type=\"submit\" value=\"Delete\" onclick=\"this.value =");
out.print(i);
      out.write("\"></input></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
}
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"total\">\n");
      out.write("                                <a>My Total : $[");
 out.print(session.getAttribute("total"));
      out.write("]</a><br />\n");
      out.write("                                    <a>Total Qty: [");
 ArrayList il = (ArrayList) session.getAttribute("itemlist");
                                    out.print(il.size());
      out.write("]</a><br />\n");
      out.write("                                <input name=\"chkout\" type=\"submit\" value=\"Checkout\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"items\">\n");
      out.write("                            <table width=\"900px\" border=\"2px\">\n");
      out.write("                                <tr class=\"border_bottom\">\n");
      out.write("                                    <td>#1</td>\n");
      out.write("                                    <td>Sunglass</td>\n");
      out.write("                                    <td>Ray-Ban, Dark Purple Sunglass with the Casing</td>\n");
      out.write("                                    <td>$34</td>\n");
      out.write("                                    <td><img src=\"img/sunglass.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                    <td><input name=\"addtocart1\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"border_bottom\">\n");
      out.write("                                    <td>#2</td>\n");
      out.write("                                    <td>Wrist Watch</td>\n");
      out.write("                                    <td>Quartz, Men's wrist watch, Black</td>\n");
      out.write("                                    <td>$66</td>\n");
      out.write("                                    <td><img src=\"img/watch.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                    <td><input name=\"addtocart2\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"border_bottom\">\n");
      out.write("                                    <td>#3</td>\n");
      out.write("                                    <td>Camera</td>\n");
      out.write("                                    <td>Lumix, 16x Digital Camera</td>\n");
      out.write("                                    <td>$167</td>\n");
      out.write("                                    <td><img src=\"img/camera.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                    <td><input name=\"addtocart3\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"border_bottom\">\n");
      out.write("                                    <td>#4</td>\n");
      out.write("                                    <td>Shoes</td>\n");
      out.write("                                    <td>Bettans, 60 Leather Shoes, Brown</td>\n");
      out.write("                                    <td>$23</td>\n");
      out.write("                                    <td><img src=\"img/shoes.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                    <td><input name=\"addtocart4\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </center> \n");
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
