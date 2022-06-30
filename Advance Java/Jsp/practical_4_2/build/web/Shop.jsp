<%@page import="java.util.ArrayList"%>
<%@ page import="classes.Item" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <%
            String user = (String) session.getAttribute("user");
            if (user == null) {
                response.sendRedirect("index.jsp");
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Shopping Cart - Shop</title>
    </head>
    <body style="background-color: #EDE6DB"><center>
            <div class="container">
                <form action="requesthandle" method="post">
                    <div class="headbanner">
                        <h1>
                            <center>
                                <img src="img/shopping_1.png" width="5%" height="5%"/>[My Shopping Cart]
                            </center>
                        </h1>
                    </div>
                    <div class="mycontent">
                        <div class="cartof">
                            <center><a>Cart Of [<% out.print(session.getAttribute("user"));%>]<input name="logout" type="submit" value="Logout"></input></a></center>
                        </div>
                        <div class="cartcontent">
                            <div class="myitems">
                                <table width="600px" cellpadding="0" cellspacing="0" border="2px">
                                    <tr>
                                        <th>#id</th>
                                        <th>Item</th>
                                        <th>Price</th>
                                        <th>Action</th>
                                    </tr>
                                    <%if (session.getAttribute("itemlist") != null) {
                                            ArrayList mycart = (ArrayList) session.getAttribute("itemlist");
                                            for (int i = 0; i < mycart.size(); i++) {
                                                Item it = (Item) mycart.get(i);
                                    %>
                                    <tr>
                                        <td align="center"><%out.print(i);%></td>
                                        <td align="center"><% out.print(it.name);%></td>
                                        <td align="center"><% out.print(it.price);%></td>
                                        <td align="center"><input name="del" type="submit" value="Delete" onclick="this.value =<%out.print(i);%>"></input></td>
                                    </tr>
                                    <%}
                                        }
                                    %>
                                </table>
                            </div>
                            <div class="total">
                                <a>My Total : $[<% out.print(session.getAttribute("total"));%>]</a><br />
                                    <a>Total Qty: [<% ArrayList il = (ArrayList) session.getAttribute("itemlist");
                                    out.print(il.size());%>]</a><br />
                                <input name="chkout" type="submit" value="Checkout" />
                            </div>
                        </div>
                        <div class="items">
                            <table width="900px" border="2px">
                                <tr class="border_bottom">
                                    <td>#1</td>
                                    <td>Sunglass</td>
                                    <td>Ray-Ban, Dark Purple Sunglass with the Casing</td>
                                    <td>$34</td>
                                    <td><img src="img/sunglass.jpg" width="90" height="90" /></td>
                                    <td><input name="addtocart1" type="submit" value="Add to Cart" /></td>
                                </tr>
                                <tr class="border_bottom">
                                    <td>#2</td>
                                    <td>Wrist Watch</td>
                                    <td>Quartz, Men's wrist watch, Black</td>
                                    <td>$66</td>
                                    <td><img src="img/watch.jpg" width="90" height="90" /></td>
                                    <td><input name="addtocart2" type="submit" value="Add to Cart" /></td>
                                </tr>
                                <tr class="border_bottom">
                                    <td>#3</td>
                                    <td>Camera</td>
                                    <td>Lumix, 16x Digital Camera</td>
                                    <td>$167</td>
                                    <td><img src="img/camera.jpg" width="90" height="90" /></td>
                                    <td><input name="addtocart3" type="submit" value="Add to Cart" /></td>
                                </tr>
                                <tr class="border_bottom">
                                    <td>#4</td>
                                    <td>Shoes</td>
                                    <td>Bettans, 60 Leather Shoes, Brown</td>
                                    <td>$23</td>
                                    <td><img src="img/shoes.jpg" width="90" height="90" /></td>
                                    <td><input name="addtocart4" type="submit" value="Add to Cart" /></td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </form>
            </div>
        </center> 
    </body>
</html>