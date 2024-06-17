<%-- 
    Document   : directive
    Created on : Jun 17, 2024, 2:07:01 PM
    Author     : kpanchal
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>

<%--<%@include file="header.jsp" %>--%>
<%--<%@ include file="index.html" %>--%>

<%--<jsp:include page="dynamicContent.jsp" />--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= new Date()%>

        <c:out value="${'Welcome to javaTpoint'}"/>  
        <c:set var="income" scope="session" value="${4000*4}"/>  
        <c:if test="${income > 8000}">  
           <p>My income is: <c:out value="${income}"/><p>  
        </c:if>
    </body>
</html>
