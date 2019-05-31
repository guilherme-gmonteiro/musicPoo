/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class MusicaDao {

    public static ArrayList<Musica> ultimasAdicionadas() {
        ArrayList<Musica> listaMusicas;
        listaMusicas = new ArrayList<Musica>();
        try {
            
            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT m.id as musica_id, m.nome as musica_nome,"
                    + " duracao, caminho, id_album, a.id as album_id, a.nome as album,"
                    + " imagem, artista FROM musicas m INNER JOIN albums a ON(m.id_album = a.id)"
                    + " ORDER BY data_upload DESC LIMIT 10");
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Musica musica = new Musica(rs.getString("caminho"), rs.getString("musica_nome"),
                rs.getString("duracao"), rs.getInt("id_album"));
                musica.setImagem(rs.getString("imagem"));
                musica.setArtista(rs.getString("artista"));
                listaMusicas.add(musica);
            }
            return listaMusicas;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return listaMusicas;

    }
    
        public static boolean salvar(Musica musica) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO musicas (nome, duracao, caminho, id_album) VALUES(?, ?, ?, ?)");
            comando.setString(1, musica.getNome());
            comando.setString(2, musica.getDuracao());
            comando.setString(3, musica.getCaminho());
            comando.setInt(4, musica.getIdAlbum());
            
            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
