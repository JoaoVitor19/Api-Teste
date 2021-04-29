package com.example.prova.Model;

public class Cinema {

    private int idCinema;
    private String nomeCinema;
    private int qntSessoes;

    public Cinema(int idCinema, String nomeCinema, int qntSessoes) {
        this.idCinema = idCinema;
        this.nomeCinema = nomeCinema;
        this.qntSessoes = qntSessoes;
    }

    public Cinema() {

    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public int getQntSessoes() {
        return qntSessoes;
    }

    public void setQntSessoes(int qntSessoes) {
        this.qntSessoes = qntSessoes;
    }
}
