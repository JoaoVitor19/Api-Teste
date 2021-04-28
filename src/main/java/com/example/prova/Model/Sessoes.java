package com.example.prova.Model;

public class Sessoes {
    private int idSessao;
    private String nomeSessao;
    private int qntSessoes;
    private String categoriaFilme;

    public Sessoes(){

    }

    public Sessoes(int idSessao, String nomeSessao, int qntSessoes, String categoriaFilme) {
        this.idSessao = idSessao;
        this.nomeSessao = nomeSessao;
        this.qntSessoes = qntSessoes;
        this.categoriaFilme = categoriaFilme;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public String getNomeSessao() {
        return nomeSessao;
    }

    public void setNomeSessao(String nomeSessao) {
        this.nomeSessao = nomeSessao;
    }

    public int getQntSessoes() {
        return qntSessoes;
    }

    public void setQntSessoes(int qntSessoes) {
        this.qntSessoes = qntSessoes;
    }

    public String getCategoriaFilme() {
        return categoriaFilme;
    }

    public void setCategoriaFilme(String categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }

    @Override
    public String toString() {
        return "Sessoes{" +
                "idSessao=" + idSessao +
                ", nomeSessao='" + nomeSessao + '\'' +
                ", qntSessoes=" + qntSessoes +
                ", categoriaFilme='" + categoriaFilme + '\'' +
                '}';
    }
}
