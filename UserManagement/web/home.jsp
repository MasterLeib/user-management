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
        <h1>Welcome Home, ${sessionScope.username}</h1>
        <form action="MainController" method="POST">
            <input type="submit" value="Logout"/>
            <input type="hidden" name="action" value="LogoutController"/>
        </form>
        <a href="MainController?action=ViewUsersController">Go to view_users.jsp</a><br/>
        <a href="MainController?action=ViewRolesController">Go to view_roles.jsp</a><br/>
        <a href="MainController?action=ViewPromotionsController">Go to view_promotions.jsp</a><br/>
        <a href="insert_user.jsp">Go to insert_user.jsp</a><br/>
        <a href="delete_user.html">Go to delete_user.html</a><br/>
        <a href="MainController?action=AdminViewUsersController">Go to admin_view_users</a><br/>
        <a href="input_user_id.html">Go to input_user_id.html</a><br/>
        <a href="MainController?action=SearchUsersController">Go to search_users.jsp</a>
    </body>
    
</html>
