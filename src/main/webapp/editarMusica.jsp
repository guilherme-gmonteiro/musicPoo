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
                    <form action="" method="post" enctype="multipart/form-data">
                        <div class="form-group">
                            <label for="exampleFormControlInput1">Nome da Musica</label>
                            <input type="text" class="form-control" name="nome" id="exampleFormControlInput1" value="${requestScope.musica.getNome()}">
                        </div>
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Album</label>
                            <select class="form-control" name="album" id="exampleFormControlSelect1">
                            <c:forEach var="album" items="${requestScope.listaAlbums}">
                                <option value="<c:out value="${album.getIdAlbum()}"/>"><c:out value="${album.getNome()}"/></option>

                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="exampleFormControlFile1">Escolha o Audio da Musica</label>
                        <input type="file" name="file" class="form-control-file" id="exampleFormControlFile1">
                    </div>
                    <div class="form-group">
                        <label for="exampleFormControlInput1">Duraçao</label>
                        <input type="text" name="duracao" class="form-control" id="exampleFormControlInput1" value="${requestScope.musica.getDuracao()}">
                    </div>
                    <button class="btn btn-primary" type="submit">Fazer Upload</button>
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
