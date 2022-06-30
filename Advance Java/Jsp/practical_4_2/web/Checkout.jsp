<%@page import="java.util.ArrayList"%>
<%@ page import="classes.Item" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Shopping Cart - Check out</title>
    </head>
    <body style="background-color: #EDE6DB"><center>
            <form action="purchase" method="post">
                <%
                    ArrayList it_list = (ArrayList) session.getAttribute("itemlist");
                %>
                <div class="container">
                    <div class="headbanner">
                        <h1><center>
                                <img src="img/shopping_1.png" width="5%" height="5%"/>[My Shopping Cart]
                            </center></h1>
                    </div>
                    <div class="mycontent">
                        <a>Checkout My Cart</a><br />
                        <table width="500px" border="2px">
                            <%
                                for (int i = 0; i < it_list.size(); i++) {
                                    classes.Item itm = (Item) it_list.get(i);
                            %>
                            <tr>
                                <td><%out.print(itm.name);%></td>
                                <td><%out.print(itm.price);%></td>
                            </tr>
                            <% }%>
                            <tr>
                                <td>My Total</td><td>$[<%out.print(session.getAttribute("total"));%>]</td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Purchase" /></td>
                            </tr>
                            <tr>
                                <td><img src="img/paywith.png" width="210" height="80" /></td></tr>
                        </table>
                    </div>
                </div>
            </form>
        </center>
    </body>
</html>