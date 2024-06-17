<%-- 
    Document   : SessionIn
    Created on : Jun 17, 2024, 12:39:40 PM
    Author     : kpanchal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SessionIn" method="GET">
            <input type="hidden" name="sessionId" value=" <%= request.getParameter("sessionId")  %>">
            <input type="text" name="cookie_value" placeholder="enter cookies value">
            <input type="text" name="http_value" placeholder="enter http session value">
            <input type="submit" value="Submit">
        </form>
        <%      
            Cookie[] cookies = request.getCookies();
        %>
        <h1>After Redirect from Servlet now value are set</h1>
        <h3>username value : <%= session.getAttribute("username")  %></h3>
         <h3>cookie value : <%= cookies[0].getValue().toString()  %></h3>
         
         <h3>URL parameter <%=  request.getParameter("uname") %></h3>
         
         <h3>Hidden Field Value set by Servlet <%=  request.getParameter("sessionId") %> </h3>
    </body>
</html>
