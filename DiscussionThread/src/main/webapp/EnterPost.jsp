<%-- 
    Document   : EnterPost
    Created on : Jun 16, 2016, 12:40:38 PM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Post</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="main.css" rel="stylesheet" type="text/css" />
    </head>

    <body>
        <div class="row wrapper well col-md-10 col-md-offset-1">
            <h1>Enter a Post</h1>
            <div class="form-container">
                <form class="post-form" action="CreatePost" method="post">
                    <textarea name="post" rows="8" cols="40" placeholder="Comment Here"></textarea>
                    <br>
                    <button class="sign-up-button" type="submit">Submit</button>
                </form>
            </div>
            <div class="form-container">
                <form action="ShowComments" method="post">
                    <button class="sign-up-button" type="submit">View Posts</button>
                </form>
            </div>
        </div>
    </body>

</html>
