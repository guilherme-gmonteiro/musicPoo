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
                    <a class="btn btn-primary" href="Upload" role="button">Upload de musica</a>
                </c:if>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Nome</th>
                            <th scope="col">Ouvir</th>
                            <th scope="col">Açoes</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="musica" items="${requestScope.musicas}">
                            <tr>
                                <td scope="row">
                                    <img src="<c:out value="upload/images/${musica.getImagem()}"/>" width="50" height="50">
                                </td>
                                <td><c:out value="${musica.getNome()}"/></td>

                                <td>
                                    <audio controls>
                                        <source src="upload/songs/${musica.getCaminho()}" type="audio/mpeg">
                                        Seu Browser nao suporta audio
                                    </audio>

                                </td>
                                <td>
                                    <a href="editarMusica?id=${musica.getId()}" class="btn btn-primary" role="button" >Editar</a>
                                    <a href="#" class="btn btn-danger" role="button" >Excluir</a>
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
