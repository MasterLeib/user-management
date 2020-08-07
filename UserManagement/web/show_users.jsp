<%-- 
    Document   : show_users
    Created on : Jul 22, 2020, 9:12:55 PM
    Author     : USER
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Users</title>
    </head>
    <body>
        <h1>Show Users</h1>
        <form action="MainController" method="POST">
            <input type="text" name="txtUsername" placeholder="Search here" value="${txtUsername}">
            <input type="submit" value="Search"><br/> 
            <input type="hidden" name="action" value="SearchUsersController">
            <br/>
            <input type="radio" checked="" name="roleId" value="all">All<br/>
            
            <c:forEach items="${roles}" var="role">
                <input type="radio"
                       <c:if test="${role.id eq roleId}">
                       checked=""
                       </c:if>
                       name="roleId" value="${role.id}">${role.name}<br/>
            </c:forEach>
                
            <br/>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>                        
                        <th>Username</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Photo</th>
                        <th>Role</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>    
                    <c:forEach items="${users}" var="user">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.username}</td>
                            <td>${user.email}
                            <td>${user.phone}</td>  
                            <td>${user.photo}</td>
                            <td>${user.roleName}</td>
                            <td>${user.status}</td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
            <c:forEach begin="1" end="${totalOfPages}" var="i">
                <input name="page" value="${i}" type="submit">
            </c:forEach>
        </form>
    </body>
</html>
