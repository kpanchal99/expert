<%-- 
    Document   : javaBeans
    Created on : Jun 11, 2024, 9:06:19 PM
    Author     : kpanchal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mycompany.practical_8.User"%>
<jsp:useBean id="User" class="com.mycompany.practical_8.User" scope="session"/>
<jsp:setProperty name="User" property="name" value="Karan" />
<jsp:setProperty name="User" property="email" value="Karan@yahoo.com"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <p> Username: <jsp:getProperty name="User" property="name"/></p>
    	<p> Email: <jsp:getProperty name="User" property="email"/></p>
    </body>
</html>