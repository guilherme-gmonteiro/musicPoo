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

    public static ArrayList<Album> listaAlbums() {

        return AlbumDAO.listaAlbums();
    }

    public static boolean salvar(Album album) {

        return AlbumDAO.salvar(album);
    }

    public static boolean excluir(int id) {

        return AlbumDAO.excluir(id);
    }

    public static Album pegaAlbumporId(int id) {

        return AlbumDAO.pegaAlbumporId(id);
    }

    public static boolean atualizar(Album album) {

        return AlbumDAO.atualizar(album);
    }

}
