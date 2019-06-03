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
import Models.Usuario;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

/**
 *
 * @author guilherme
 */
@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
public class Upload extends HttpServlet {

    private String filePath = "upload/songs/";
    private int maxFileSize = 500000 * 1024;
    private int maxMemSize = 4 * 1024;
    private File file;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        Usuario usuario = (Usuario) sessao.getAttribute("usuarioLogado");
        ArrayList<Album> listaAlbums =  AlbumController.listaAlbumsPorUsuario(usuario.getId());
        request.setAttribute("listaAlbums", listaAlbums);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/upload.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        if (ServletFileUpload.isMultipartContent(request)) {

            try {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

                ServletFileUpload upload = new ServletFileUpload(factory);
                upload.setFileSizeMax(maxFileSize);
                //upload.setSizeMax(MAX_REQUEST_SIZE);
                String uploadPath = getServletContext().getRealPath("")
                        + File.separator + filePath;
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                List<FileItem> formItems = upload.parseRequest(request);
                String nome = formItems.get(0).getString();
                String album = formItems.get(1).getString();
                String duracao = formItems.get(3).getString();
                
                if (formItems != null && formItems.size() > 0) {
                    for (FileItem item : formItems) {
                        if (!item.isFormField()) {
                            String fileName = new File(item.getName()).getName();
                            String filePath = uploadPath + File.separator + fileName;
                            File storeFile = new File(filePath);
                            item.write(storeFile);
                            
                            Musica musica = new Musica(fileName, nome, duracao,
                                     Integer.parseInt(album));
                            MusicaController.salvar(musica);
                        }
                        
                    }
                }
            } catch (FileUploadException ex) {
                Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
