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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class AlbumDAO {

    public static ArrayList<Album> listaAlbums() {
        ArrayList<Album> listaAlbums;
        listaAlbums = new ArrayList<Album>();
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM albums WHERE deleted != 1");
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Album album = new Album(rs.getString("nome"), rs.getString("imagem"), rs.getString("artista"));
                album.setIdAlbum(rs.getInt("id"));
                album.setId_usuario(rs.getInt("id_usuario"));
                listaAlbums.add(album);
            }
            return listaAlbums;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return listaAlbums;

    }

    public static Album pegaAlbumporId(int id) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM albums WHERE id = ? WHERE deleted != 1");
            comando.setInt(1, id);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Album album = new Album(rs.getString("nome"), rs.getString("imagem"), rs.getString("artista"));
                album.setIdAlbum(rs.getInt("id"));
                return album;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;

    }

    public static boolean salvar(Album album) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO albums (nome, imagem, artista, id_usuario, deleted) VALUES(?, ?, ?, ?, 0)");
            comando.setString(1, album.getNome());
            comando.setString(2, album.getImagem());
            comando.setString(3, album.getArtista());
            comando.setInt(4, album.getId_usuario());
            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean atualizar(Album album) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("UPDATE albums SET nome = ?, imagem = ?, artista = ? WHERE id = ?");
            comando.setString(1, album.getNome());
            comando.setString(2, album.getImagem());
            comando.setString(3, album.getArtista());
            comando.setInt(4, album.getIdAlbum());

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean excluir(int id) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("UPDATE albums SET deleted = 1 WHERE id = ?");

            comando.setInt(1, id);

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Album pegaListaMusicas(int id) {

        List<Musica> musicas = new ArrayList<>();
        Album album = new Album();
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT a.nome, m.id, m.nome"
                    + " as musica_nome, m.duracao, m.caminho, a.imagem"
                    + " FROM albums a INNER JOIN musicas m ON(a.id = m.id_album) WHERE a.id = ?");

            comando.setInt(1, id);
            ResultSet rs = comando.executeQuery();

            album.setIdAlbum(id);
            while (rs.next()) {
                Musica musica = new Musica(rs.getString("caminho"), rs.getString("musica_nome"), rs.getString("duracao"), id);
                musica.setImagem(rs.getString("imagem"));
                musicas.add(musica);
                album.setNome(rs.getString("nome"));

            }
            album.setMusicas(musicas);
            return album;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return album;
    }
}
