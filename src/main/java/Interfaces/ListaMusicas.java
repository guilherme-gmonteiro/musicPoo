/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Models.Musica;
import java.util.List;

/**
 *
 * @author guilherme
 */
public interface ListaMusicas {

    public List<Musica> getMusicas();

    public void setMusicas(List<Musica> musicas);

    public void addMusica(Musica musica);
    
    

}
