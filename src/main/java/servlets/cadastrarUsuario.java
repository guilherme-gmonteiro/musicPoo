/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Controllers.UsuarioController;
import Models.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guilherme
 */
@WebServlet(name = "cadastrarUsuario", urlPatterns = {"/cadastrarUsuario"})
public class cadastrarUsuario extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("senha").equals(request.getParameter("confirm-senha"))){
            Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("email"),
                    request.getParameter("senha"));
            UsuarioController.cadastrar(usuario);
            response.sendRedirect(request.getContextPath());
        }
        
    }


}
