<%-- 
    Document   : login
    Created on : Jul 6, 2020, 6:53:16 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="MainController" method="POST">
            Id:<input type="text" name="txtId"/><br/>
            Password:<input type="password" name="txtPassword" value="${password}"/><br/>
            <input type="hidden" name="action" value="LoginController"/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
