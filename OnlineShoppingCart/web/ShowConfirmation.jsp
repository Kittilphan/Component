<%-- 
    Document   : ShowConfirmation
    Created on : Oct 27, 2023, 5:31:55 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Result Page</title>
    </head>
    <body>
        <h1>Your Order is confirmed!</h1>
        <h1>The total amout is $<%= request.getAttribute("totalPrice") %></h1>
    </body>
</html>
