<%-- 
    Document   : admin_view_users
    Created on : Jul 17, 2020, 7:27:57 PM
    Author     : USER
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin | View Users</title>
    </head>
    <body>
        <h1>Admin View Users</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Index</th>
                    <th>Id</th>
                    <th>Password</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Photo</th>
                    <th>RoleId</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>1</td>
                        <td>${user.id}</td>
                        <td>${user.password}</td>
                        <td>${user.username}</td>
                        <td>${user.email}
                        <td>${user.phone}</td>  
                        <td>${user.photo}</td>
                        <td>${user.roleId}</td>
                        <td>${user.status}</td>
                    </tr>
                </c:forEach>                
            </tbody>
        </table>

    </body>
</html>
