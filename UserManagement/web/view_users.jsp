<%-- 
    Document   : view_users
    Created on : Jul 8, 2020, 8:16:17 PM
    Author     : USER
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <h1>View Users</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>password</th>
                    <th>username</th>
                    <th>email</th>
                    <th>phone</th>
                    <th>photo</th>
                    <th>roleId</th>
                    <th>status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach     items="${users}"  var="user"         >
                    <tr>
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
                <c:forEach items="${user}" var="user">
                     <tr>
                    <td>${user.id}</td>
                    <td>${user.password}</td>
                    <td>${user.username}</td>
                    <td>${user.email}
                    <td>${user.phone}</td>  
                    <td>${user.photo}</td>
                    <td>${user.roleId}</td>
                </tr>

                </c:forEach>
                    
                              
            </tbody>
        </table>

    </body>
</html>
