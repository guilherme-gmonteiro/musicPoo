/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.MusicaDao;
import Models.Musica;
import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class MusicaController {

    public static ArrayList<Musica> ultimasAdicionadas() {

        return MusicaDao.ultimasAdicionadas();
    }

    public static boolean salvar(Musica musica) {

        return MusicaDao.salvar(musica);
    }

}
