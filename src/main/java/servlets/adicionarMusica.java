/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Controllers.PlaylistController;
import Models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guilherme
 */
@WebServlet(name = "adicionarMusica", urlPatterns = {"/adicionarMusica"})
public class adicionarMusica extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        Usuario usuario = (Usuario) sessao.getAttribute("usuarioLogado");
        request.setAttribute("playlists", PlaylistController.listaPlaylistsPorUsuario(usuario.getId()));
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/adicionarMusica.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PlaylistController.adicionarMusica(Integer.parseInt(request.getParameter("idmusica")), Integer.parseInt(request.getParameter("playlist")));
        response.sendRedirect(request.getContextPath() + "/listaMusicas");
    }

}
