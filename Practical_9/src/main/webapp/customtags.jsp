<%-- 
    Document   : customtags
    Created on : Jun 12, 2024, 9:16:21 PM
    Author     : kpanchal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="hello" uri="/WEB-INF/hello.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Custom Tag Example</title>
    </head>
    <body>
        <h1> Tag Example</h1>
        <hello:helloWorld />
        <hello:bubuTag />
    </body>
</html>