<%-- 
    Document   : ViewPosts
    Created on : Jun 16, 2016, 12:40:55 PM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="main.css" rel="stylesheet" type="text/css" />
    </head>

    <body>
        <div class="row wrapper well col-md-10 col-md-offset-1">
            <h1>Posts</h1>
            <c:forEach var="comment" items="${comments}">
                <li>${comment}</li>
                </c:forEach>

            <a class="sign-up-button" href="EnterPost.jsp">Enter Post</a>
        </div>
    </body>

</html>

