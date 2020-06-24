<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : login
    Created on : Jun 19, 2020, 8:46:30 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
            .red {
                color:red
            }
        </style>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="MainController" method="POST">
            Username:<input type="text" name="txtUsername" autofocus="" value="${username}"/>
          <b class="red">  ${userMsg}</b>

            <br/>
            Password:<input type="password" name="txtPassword" value="${password}"/>
            <c:if test="${!isPassTrue}">
                <b class="red">Password is wrong</b>
            </c:if>
            <br/>
            <input type="hidden" name="action" value="LoginController"/>
            <input type="submit" value="Login"/>

        </form>
    </body>
</html>
