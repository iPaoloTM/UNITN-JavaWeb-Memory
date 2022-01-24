<%-- 
    Document   : home.jsp
    Created on : 14-gen-2022, 19.20.15
    Author     : paoloaliprandi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="paolo.aliprandi.obj.Classifica" %>
<jsp:useBean id="classifica" class="paolo.aliprandi.obj.Classifica" scope="application" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script>
            function playGame() {
                window.location.href="game.html";
            }
        </script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <h2>Classifica:</h2>
        <div><%= classifica.getFormattedClassifica() %></div>
        <hr>
        <div><button onclick="playGame()">Gioca!</button></div>   
    </body>
</html>
