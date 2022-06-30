<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Shopping Cart - Login</title>
    </head>
    <body style="background-color: grey"><center>
            <div class="container">
                <div class="headbanner">
                    <h1>
                        <center>
                            <img src="img/shopping_1.png" width="5%" height="5%"/>[My Shopping Cart]
                        </center>
                    </h1>
                </div>
                <div class="mycontent">
                    <div class="space"><span><a class="formtext">Login</a></span></div>
                    <div class="formcontent">
                        <form action="loginval" method="post">
                            <table border="2px">
                                <tr>
                                    <td class="formtext">Username :</td>
                                    <td><input id="name" name="uname" type="text" size="30" /></td><td><a>[Any name]</a></td>
                                </tr>
                                <tr>
                                    <td class="formtext">Password :</td>
                                    <td><input id="pas" name="pass" type="password" size="30" /></td><td><a>[Pass = 1234]</a></td>
                                </tr>
                                <tr>
                                    <td colspan="3"><center> <input type="submit" value="Submit"/></td></center>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </center>
    </body>
</html>