/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.AlbumDAO;
import Models.Album;
import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class AlbumController {

    public static ArrayList<Album> listaAlbumsPorUsuario(int id){
        
        return AlbumDAO.listaAlbumsPorUsuario(id);
    }
    
    public static boolean salvar(Album album){
    
        return AlbumDAO.salvar(album);
    }

}
