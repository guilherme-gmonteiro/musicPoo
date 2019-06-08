<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="wrapper row1">
    <header id="header" class="clear">
        <div id="hgroup">
            <h1><a href="#">Music Player</a></h1>
            <h2>Trabalho de Poo</h2>
        </div>
        <nav>
            <ul>
                <c:if test="${sessionScope.usuarioLogado.getNome() != null}">
                Ola ${sessionScope.usuarioLogado.getNome()}!&nbsp;&nbsp;
                </c:if>
                <li><a href="Inicio">Inicio</a></li>
                <li><a href="listaPlaylists">Playlists</a></li>
                <li><a href="listaMusicas">Músicas</a></li>
                <li><a href="listaAlbums">Albums</a></li>
                <c:if test="${sessionScope.usuarioLogado.getNome() == null}">
                    <li><a href="Login">Login</a></li>
                </c:if>
                
            </ul>
        </nav>
    </header>
</div>