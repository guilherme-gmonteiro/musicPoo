/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Musica;
import Models.Playlist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    public static ArrayList<Playlist> listaPlaylistsPorUsuario(int id) {
        ArrayList<Playlist> listaPlaylists;
        listaPlaylists = new ArrayList<Playlist>();
        try {
            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM playlists WHERE id_usuario = ?");
            comando.setInt(1, id);
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
        List<Musica> musicas = new ArrayList<>();
        Playlist playlist = new Playlist();
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT a.imagem, p.nome, m.nome as nome_musica, m.duracao, m.caminho, m.id_album FROM playlists p"
                    + " INNER JOIN playlist_musica pm ON (p.id = pm.id_playlist)"
                    + " INNER JOIN musicas m ON (m.id = pm.id_musica)"
                    + " INNER JOIN albums a ON(m.id_album = a.id) WHERE p.id = ?");

            comando.setInt(1, id);
            ResultSet rs = comando.executeQuery();

            playlist.setId(id);
            while (rs.next()) {
                Musica musica = new Musica(rs.getString("caminho"), rs.getString("nome_musica"), rs.getString("duracao"), rs.getInt("id_album"));
                musica.setImagem(rs.getString("imagem"));
                musicas.add(musica);
                playlist.setNome(rs.getString("nome"));

            }
            playlist.setMusicas(musicas);
            return playlist;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return playlist;

    }

    public static boolean salvar(Playlist playlist) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO playlists (nome) VALUES(?)");
            comando.setString(1, playlist.getNome());

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean adicionarMusica(int idmusica, int idplaylist) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO playlist_musica (id_musica, id_playlist) VALUES(?, ?)");
            comando.setInt(1, idmusica);
            comando.setInt(2, idplaylist);
            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
