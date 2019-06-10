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
public class Album implements ListaMusicas {

    private int id_album;
    private String nome;
    private String imagem;
    private String artista;
    private int id_usuario;
    private List<Musica> musicas = new ArrayList<>();

    public Album(String nome, String imagem, String artista) {
        this.nome = nome;
        this.imagem = imagem;
        this.artista = artista;
    }

    public Album(int id) {
        this.id_album = id;

    }

    public Album() {
    }

    public int getId_album() {
        return id_album;
    }

    public void setId_album(int id_album) {
        this.id_album = id_album;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getIdAlbum() {
        return id_album;
    }

    public void setIdAlbum(int id) {
        this.id_album = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
