/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Controllers.AlbumController;
import Controllers.PlaylistController;
import Models.Album;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guilherme.gmonteiro3
 */
@WebServlet(name = "AlbumList", urlPatterns = {"/AlbumList"})
public class AlbumList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Album album = AlbumController.pegaListaMusicas(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("album", album);
        request.setAttribute("musicas", album.getMusicas());
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/album.jsp");
        dispatcher.forward(request, response);

    }

}
