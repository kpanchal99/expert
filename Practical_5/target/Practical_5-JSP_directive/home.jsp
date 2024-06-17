<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page Directives Example</title>
</head>
<body>
    <h1>Page Directive</h1>
    Today is: <%= new Date() %>  

    <h1>Include Directive</h1>
    <%@ include file="header.html" %>  

    <h1>Taglib Directive</h1>
    <!-- Example tag usage, assuming a custom tag is defined and available -->
    <%-- Ensure the URI and prefix are correctly set when the tag library is available --%>
    <%-- <mytag:exampleTag /> --%>
    <form action="LoginServlet" method="GET">
        <input type="text" placeholder="enter name" name="username">
            
        </input>
        <button type="submit" text="submit" value="submit">sdfsdf</button>
    </form>
</body>
</html>
