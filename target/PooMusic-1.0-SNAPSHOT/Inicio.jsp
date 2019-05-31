<%-- 
    Document   : Inicio
    Created on : May 31, 2019, 3:13:49 PM
    Author     : guilherme
--%>

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
              <li class="one_quarter"><img src="images/demo/215x150.gif" width="215" height="150" alt=""></li>
              <li class="one_quarter"><img src="images/demo/215x150.gif" width="215" height="150" alt=""></li>
              <li class="one_quarter"><img src="images/demo/215x150.gif" width="215" height="150" alt=""></li>
              <li class="one_quarter lastbox"><img src="images/demo/215x150.gif" width="215" height="150" alt=""></li>
            </ul>
            <figcaption><a href="#">View All Our Recent Work Here &raquo;</a></figcaption>
          </figure>
        </article>
      </section>
      <!-- / One Quarter -->
      <!-- ########################################################################################## -->
      <!-- ########################################################################################## -->
      <!-- ########################################################################################## -->
      <!-- ########################################################################################## -->
      <!-- services area -->
      <section id="services" class="last clear">
        <article class="one_quarter">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <article class="one_quarter">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <article class="one_quarter">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <article class="one_quarter lastbox">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <!-- spacer - clearer -->
        <div class="spacer"></div>
        <!-- / spacer - clearer -->
        <article class="one_quarter">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <article class="one_quarter">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <article class="one_quarter">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
        <article class="one_quarter lastbox">
          <figure><img src="images/demo/32x32.gif" width="32" height="32" alt=""></figure>
          <strong>Lorum ipsum dolor</strong>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non diam erat. In fringilla massa ut nisi ullamcorper.</p>
          <p class="more"><a href="#">Read More &raquo;</a></p>
        </article>
      </section>
      <!-- / services area -->
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
