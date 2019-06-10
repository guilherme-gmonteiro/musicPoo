/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.PlaylistDAO;
import Models.Playlist;
import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class PlaylistController {

    public static ArrayList<Playlist> listaPlaylists() {

        return PlaylistDAO.listaPlaylists();
    }

    public static Playlist pegaporId(int id) {

        return PlaylistDAO.pegaporId(id);

    }

    public static boolean salvar(Playlist playlist) {

        return PlaylistDAO.salvar(playlist);

    }

}
