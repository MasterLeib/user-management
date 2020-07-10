<%-- 
    Document   : home
    Created on : Jul 6, 2020, 6:47:12 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Welcome Home</h1>
        <form action="MainController" method="POST">
            <input type="submit" value="Logout"/>
            <input type="hidden" name="action" value="LogoutController"/>
        </form>
        <a href="MainController?action=ViewUsersController">Go to view_users.jsp</a><br/>
        <a href="MainController?action=ViewRolesController">Go to view_roles.jsp</a>
    </body>
    
</html>
