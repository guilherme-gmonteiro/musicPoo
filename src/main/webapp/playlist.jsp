<%@page import="java.util.ArrayList"%>
<%@page import="Models.Musica"%>
<%@page import="Models.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Player de Música - Tades</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <link rel="stylesheet" href="css/style.css">
         <link rel="stylesheet" href="css/layout.css" type="text/css">

    </head>

    <body>
        <jsp:include page="parts/header.jsp"></jsp:include>
        <div class="container">
            <div class="column center">
                <br>
                <h6>${requestScope.playlist.getNome()}</h6>
            </div>
            <div class="column add-bottom">
                <div id="mainwrap">
                    <div id="nowPlay">
                        <span class="left" id="npAction">Paused...</span>
                        <span class="right" id="npTitle"></span>
                    </div>
                    <div id="audiowrap">
                        <div id="audio0">
                            <audio preload id="audio1" controls="controls">Your browser does not support HTML5 Audio!</audio>
                        </div>
                        <div id="tracks">
                            <a id="btnPrev">&laquo;</a>
                            <a id="btnNext">&raquo;</a>
                        </div>
                    </div>
                    <div id="plwrap">
                        <ul id="plList">
                            <c:forEach var="musica" items="${requestScope.musicas}">
                            <li>
                                <div class="pltest"><img src="https://images-na.ssl-images-amazon.com/images/I/81YYnSOZSEL._SY355_.jpg" width="80" height="80"></div>
                                <div class="plItem">
                                    <div class="plNum">01.</div>
                                    
                                    <div class="plTitle"><c:out value="${musica.getNome()}"/></div>
                                    <div class="plLength"><c:out value="${musica.getDuracao()}"/></div>
                                    <input type="hidden" name="caminho" value="<c:out value="${musica.getCaminho()}"/>">
                                </div>
                            </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js'></script>
        <script src='http://api.html5media.info/1.1.8/html5media.min.js'></script>

        <script src="js/index.js"></script>

    </body>
</html>
