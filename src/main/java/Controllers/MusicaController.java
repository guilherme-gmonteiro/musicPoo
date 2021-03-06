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

    public static ArrayList<Musica> musicasUsuario() {

        return MusicaDao.musicasUsuario();
    }

    public static Musica musicaPorId(int id) {

        return MusicaDao.musicaPorId(id);
    }
    
        public static boolean excluir(int id) {

        return MusicaDao.excluir(id);
    }

    public static boolean salvar(Musica musica) {

        return MusicaDao.salvar(musica);
    }

    public static boolean atualizar(Musica musica) {

        return MusicaDao.atualizar(musica);
    }

}
