<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h3>Details are:-</h3>
        <table border='5'>
            <tr><td>ID is:</td><td>${person.ID}</td></tr>
            <tr><td>NAme is:</td><td>${person.NAME}</td></tr>
            <tr><td>Mobile No is:</td><td>${person.MOBILE}</td></tr>
            <tr><td>Semester is:</td><td>${person.SEM}</td></tr>
            <tr><td>Mark is:</td><td>${person.MARK}</td></tr>
            <tr><td>Percentage is:</td><td>${person.PER}</td></tr>
        </table>
    </center>
    </body>
</html>