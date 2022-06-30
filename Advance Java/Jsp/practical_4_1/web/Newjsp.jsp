<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    Cookie fname = new Cookie("fname", request.getParameter("fname"));
    Cookie lname = new Cookie("lname", request.getParameter("lname"));
    fname.setMaxAge(60 * 60 * 10);
    lname.setMaxAge(60 * 60 * 10);
    response.addCookie(fname);
    response.addCookie(lname);
%>
<html>
    <head><title>Cookie using JSP</title></head>
    <body>
        <h3>Value of Cookie with JSP </h3>
        <b>First Name:</b><%= request.getParameter("fname")%><br>
        <b>Last Name:</b> <%= request.getParameter("lname")%>
    </body>
</html>