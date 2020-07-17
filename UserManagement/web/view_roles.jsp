<%-- 
    Document   : view_roles
    Created on : Jul 10, 2020, 8:04:37 PM
    Author     : USER
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Roles</title>
    </head>
    <body>
        <h1>View Roles</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>name</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${roles}" var="role">
                <tr>
                    <td>${role.id}</td>
                    <td>${role.name}</td>
                </tr>                
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
