
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css">
    </head>
<body>
  <jsp:include page="parts/header.jsp"></jsp:include>
<!-- content -->
<div class="wrapper row2">
  <div id="container" class="clear">
    <!-- content body -->
    <section id="shout">
      <p>Bem vindo ao seu player de música! Aqui você pode conferir as 10 Ultimas músicas Adicionadas de outros usuários</p>
    </section>
    <!-- main content -->
    <div id="homepage">
      <!-- One Quarter -->
      <section id="latest">
        <article>
          <figure>
            <ul>
            <c:forEach var="musica" items="${requestScope.musicas}">
              <li class="one_quarter">
                  <img src="upload/images/<c:out value="${musica.getImagem()}"/>" width="215" height="150" alt="">
                  <p><c:out value="${musica.getNome()}"/></p>
              </li>
            </c:forEach>
             
            </ul>
            
          </figure>
        </article>
      </section>
    </div>
    <!-- / content body -->
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
