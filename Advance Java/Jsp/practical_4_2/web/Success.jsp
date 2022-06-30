<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Shopping Cart - Success</title>
    </head>
    <body style="background-color: #EDE6DB"><center>
            <%if (session.getAttribute("purch") != "true") {
                    response.sendRedirect("Index.jsp");
                }%>
            <form action="Shop.jsp" method="post">
                <div class="container">
                    <div class="headbanner">
                        <h1><center>
                                <img src="img/shopping_1.png" width="5%" height="5%"/>[My Shopping Cart]
                            </center></h1>
                    </div>
                    <div class="mycontent">
                        <h3 align="center">Purchase has been succeeded! Thank You.<br /><input type="submit" value="Ok" /></h3>
                    </div>
                </div>
            </form>
        </center></body>
</html>