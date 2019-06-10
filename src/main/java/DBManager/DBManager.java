/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBManager;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class DBManager {

    private static String url = "";
    private static String SERVIDOR = "localhost";
    private static String BASEDADOS = "playerMusica";
    private static java.sql.Connection conexao;
    private static String bduser = "guilherme";
    private static String bdpass = "1n0o9r7";

    public static java.sql.Connection conectaDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://" + SERVIDOR + ":3306/" + BASEDADOS + "?useTimezone=true&serverTimezone=UTC";
            conexao = DriverManager.getConnection(url, bduser, bdpass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexao;
    }

}
