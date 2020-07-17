<%-- 
    Document   : view_promotions
    Created on : Jul 11, 2020, 3:08:15 PM
    Author     : USER
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Promotion</title>
    </head>
    <body>
        <h1>View Promotions</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>user_id</th>
                    <th>rank</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${promotions}" var="promotion">
                <tr>
                    <td>${promotion.userId}</td>
                    <td>${promotion.rank}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
