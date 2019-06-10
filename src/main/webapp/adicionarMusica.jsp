<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <link rel="stylesheet" href="css/layout.css" type="text/css">
    </head>
    <body>
        <jsp:include page="parts/header.jsp"></jsp:include>
            <!-- content -->
            <div class="wrapper row2">
                <div id="container" class="clear">
                    <!-- content body -->
                    <form action="" method="post">
                        <div class="form-group">
                            <label for="exampleFormControlInput1">Adicione a música a alguma playlist</label>
                            <input type="hidden" name="idmusica" value="${param.id}">
                            <select class="form-control" name="playlist" id="exampleFormControlInput1">
                            <c:forEach var="playlist" items="${requestScope.playlists}">
                                <option value="<c:out value="${playlist.getId()}"/>"><c:out value="${playlist.getNome()}"/></option>
                            </c:forEach>
                        </select>

                    </div>
                    <button class="btn btn-primary" type="submit">Adicionar</button>
                </form>
            </div>
        </div>
        <!-- Footer -->
        <div class="wrapper row3">
            <footer id="footer" class="clear">
                <p class="fl_left">Music Player - TADES</p>

            </footer>
        </div>
    </body>
</html>
