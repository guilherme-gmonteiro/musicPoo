/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.UsuarioDAO;
import Models.Usuario;

/**
 *
 * @author guilherme
 */
public class UsuarioController {
    
    public static boolean cadastrar(Usuario usuario) {
        return UsuarioDAO.cadastrar(usuario);
    }
    
    public static Usuario logar(String email, String senha) {
        return UsuarioDAO.logar(email, senha);
    }
    
}
