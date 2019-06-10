/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class UsuarioDAO {

    public static boolean cadastrar(Usuario usuario) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO usuarios (nome, email, senha) VALUES(?, ?, ?)");
            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getEmail());
            comando.setString(3, usuario.getSenha());
            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Usuario logar(String email, String senha) {
        try {

            Connection conexao = DBManager.DBManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND senha = ?");
            comando.setString(1, email);
            comando.setString(2, senha);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Usuario usuario =  new Usuario(rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
                usuario.setId(rs.getInt("id"));
                return usuario;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return new Usuario("false", "false", "false");
    }

}
