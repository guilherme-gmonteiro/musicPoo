/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interfaces.ListaMusicas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme
 */
public class Playlist implements ListaMusicas {

    private int id;
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public Playlist(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Playlist() {

    }

    public Playlist(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public List<Musica> getMusicas() {
        return musicas;
    }

    @Override
    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }

}
