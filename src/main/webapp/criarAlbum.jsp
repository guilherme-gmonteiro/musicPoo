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
                            <label for="exampleFormControlInput1">Nome do Album</label>
                            <input type="text" class="form-control" name="nome" id="exampleFormControlInput1" placeholder="Into the Wild">
                        </div>
                   <div class="form-group">
                            <label for="exampleFormControlInput1">Artista</label>
                            <input type="text" class="form-control" name="nome" id="exampleFormControlInput1" placeholder="Eddie Vedder">
                        </div>
                    <div class="form-group">
                        <label for="exampleFormControlFile1">Imagem do Album</label>
                        <input type="file" name="file" class="form-control-file" id="exampleFormControlFile1">
                    </div>
                    <button class="btn btn-primary" type="submit">Salvar Album</button>
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
