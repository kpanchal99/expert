<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="myerrorpage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Demo ! </title>
    </head>
    <body>
        <h1>Welcome To Error Page Demo!</h1>
            <% 
        // Simulating an error
        int num = 10;
        int deno = 0;
        int r = num / deno;
    %>
   
    <p>Error Page</p>
    </body>
</html>