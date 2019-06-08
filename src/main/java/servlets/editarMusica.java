/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Controllers.AlbumController;
import Controllers.MusicaController;
import Models.Album;
import Models.Musica;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guilherme
 */
@WebServlet(name = "editarMusica", urlPatterns = {"/editarMusica"})
public class editarMusica extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Musica musica = MusicaController.musicaPorId(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("musica", musica);
        ArrayList<Album> listaAlbums = AlbumController.listaAlbums();
        request.setAttribute("listaAlbums", listaAlbums);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/editarMusica.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
