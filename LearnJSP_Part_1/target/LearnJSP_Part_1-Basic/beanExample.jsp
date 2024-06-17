<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UseBean and Set Example</title>
    </head>
    <body>
        <jsp:useBean id="user" class="com.mycompany.learnjsp_part_1.UserBean" scope="session" />
        <jsp:setProperty name="user" property="name" value="John Doe" />
        <jsp:setProperty name="user" property="age" value="30" />

        <h2>User Information</h2>
        <p>Name: <jsp:getProperty name="user" property="name" /></p>
        <p>Age: <jsp:getProperty name="user" property="age" /></p>
    </body>
</html>
