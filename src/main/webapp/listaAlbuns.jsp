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
                <c:if test="${sessionScope.usuarioLogado.getNome() != null}">
                    <a class="btn btn-primary" href="criarAlbum" role="button">Criar Album</a>
                </c:if>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Nome</th>
                            <th scope="col">Ações</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="album" items="${requestScope.albums}">
                            <tr>
                                <th scope="row">
                                    <img src="upload/images/<c:out value="${album.getImagem()}"/>" width="50" height="50">
                                </th>
                                <td><c:out value="${album.getNome()}"/></td>

                                <td>
                                    <form action="AlbumList" method="POST">
                                        <input type="hidden" name="id" value="<c:out value="${album.getIdAlbum()}"/>">
                                        <input type="submit" class="btn btn-primary" value="Ouvir">
                                        <c:if test="${sessionScope.usuarioLogado.getId() == album.getId_usuario()}">
                                            <a href="editarAlbum?id=${album.getIdAlbum()}" class="btn btn-primary" role="button" >Editar</a>
                                            <a href="excluirAlbum?id=${album.getIdAlbum()}" class="btn btn-danger" role="button" >Excluir</a>
                                        </c:if>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
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
