<%-- 
    Document   : Search
    Created on : Jun 16, 2024, 9:33:45 PM
    Author     : kpanchal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="LoginServlet" method="POST">
            <input type="type" name="search" placeholder="enter to search">
            <button type="submit" value="redirect" name="btn">redirect</button>
            <button type="submit" value="forward" name="btn">forward</button>
            <button type="submit" value="include" name="btn">include</button>
        </form>
    </body>
</html>
