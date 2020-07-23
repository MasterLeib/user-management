<%-- 
    Document   : show_user_to_update
    Created on : Jul 19, 2020, 2:42:38 PM
    Author     : USER
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update User</title>
    </head>
    <body>
        <h1>Update User</h1>
        <form action="MainController" method="POST">
            ID:<input type="text" name="txtId" value="${user.id}" readonly=""/><br/>
            Password:<input type="text" name="txtPassword" value="${user.password}"/><br/>
            Username:<input type="text" name="txtUsername" value="${user.username}"/><br/>
            Email:<input type="text" name="txtEmail" value="${user.email}"/><br/>
            Phone:<input type="text" name="txtPhone" value="${user.phone}"/><br/>
            Photo<input type="text" name="txtPhoto" value="${user.photo}"/><br/>
            Role<input type="text" name="txtRole" value="${user.roleId}"/><br/>             
            <input type="submit" value="Update"/>
            <input type="hidden" name="action" value="UpdateUserController"/>                   
        </form>
    </body>
</html>
