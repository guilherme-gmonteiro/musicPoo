/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author guilherme
 */
public class Musica extends Album {
    
    private int id;
    private String caminho;
    private String nome;
    private String duracao;
    private int id_usuario;
    
    public Musica(String caminho, String nome, String duracao, int id_album) {
        super(id_album);
        this.caminho = caminho;
        this.nome = nome;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId_usuario() {
        return id_usuario;
    }
    
    @Override
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

   
}
