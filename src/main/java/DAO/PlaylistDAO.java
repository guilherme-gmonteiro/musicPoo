/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Playlist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class PlaylistDAO {

    public static ArrayList<Playlist> listaPlaylists() {
        ArrayList<Playlist> listaPlaylists;
        listaPlaylists = new ArrayList<Playlist>();
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM playlists");
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Playlist playlist = new Playlist(rs.getInt("id"), rs.getString("nome"));
                listaPlaylists.add(playlist);
            }
            return listaPlaylists;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return listaPlaylists;

    }

    public static Playlist pegaporId(int id) {

        try {
            
            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT p.nome, m.nome, m.duracao, m.caminho FROM playlists p"
                    + " INNER JOIN playlist_musica pm ON (p.id = pm.id_playlist)"
                    + " INNER JOIN musicas m ON (m.id = pm.id_musica) WHERE p.id = ?");
            
            comando.setInt(1, id);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Playlist playlist = new Playlist(rs.getInt("id"), rs.getString("nome"));
               
            }
            return playlist;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return listaPlaylists;

    }

}
