/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Album;
import Models.Musica;
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
public class AlbumDAO {

    public static ArrayList<Album> listaAlbumsPorUsuario(int idusuario) {
        ArrayList<Album> listaAlbums;
        listaAlbums = new ArrayList<Album>();
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM albums WHERE id_usuario = ?");
            comando.setInt(1, idusuario);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Album album = new Album(rs.getString("nome"), rs.getString("imagem"), rs.getString("artista"));
                album.setIdAlbum(rs.getInt("id"));
                listaAlbums.add(album);
            }
            return listaAlbums;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return listaAlbums;

    }

    public static boolean salvar(Album album) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO albums (nome, imagem, artista) VALUES(?, ?, ?)");
            comando.setString(1, album.getNome());
            comando.setString(2, album.getImagem());
            comando.setString(3, album.getArtista());

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
