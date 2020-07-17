<%-- 
    Document   : insert
    Created on : Jul 13, 2020, 7:20:17 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert</title>
    </head>
    <body>
        <h1>Insert to Database</h1>
        <form action="MainController" method="POST">
            ID:<input type="text" name="txtId"/><br/>
            Password:<input type="password" name="txtPassword"/><br/>
            Username:<input type="text" name="txtUsername"/><br/>
            Email:<input type="text" name="txtEmail"/><br/>
            Phone:<input type="text" name="txtPhone"/><br/>
            Photo<input type="text" name="txtPhoto"/><br/>
            Role<input type="text" name="txtRole"/><br/>    
            <br/>
            <input type="submit" value="Add"/>
            <input type="hidden" name="action" value="InsertUserController"/>
        </form>
    </body>
</html>
