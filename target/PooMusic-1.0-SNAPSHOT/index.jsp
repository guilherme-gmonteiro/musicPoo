<%-- 
    Document   : index
    Created on : May 31, 2019, 2:47:07 PM
    Author     : guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
         <% response.sendRedirect(request.getContextPath() + "/Login"); %>
    </body>
</html>
