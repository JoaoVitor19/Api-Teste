package com.example.prova.Dao;

import com.example.prova.Factory.ConnectionFactory;
import com.example.prova.Model.Cinema;
import com.example.prova.Model.Sessoes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SessoesDao {

    private Connection connection;
    public SessoesDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void tableSessoesDao() {
        String sql = "CREATE TABLE IF NOT EXISTS sessoes (" +
                "idSessao INT PRIMARY KEY AUTO_INCREMENT," +
                "nomeSessao VARCHAR(50) NOT NULL," +
                "qntSessoes INT," +
                "categoriaFilme VARCHAR(45)," +
                "CONSTRAINT fk_qntSessoes FOREIGN KEY (qntSessoes)" +
                "REFERENCES Sessoes(qntSessoes)" +
                ");";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela Sessoes Criada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Sessoes> listarSessoes() {
        String sql = "SELECT * FROM sessoes";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            List<Sessoes> sessoesp = new ArrayList<>();
            Sessoes sessoes;

            while (resultSet.next()) {
                sessoes = new Sessoes();
                sessoes.setIdSessao(resultSet.getInt("idSessao"));
                sessoes.setNomeSessao(resultSet.getString("nomeSessao"));
                sessoes.setQntSessoes(resultSet.getInt("qntSessoes"));
                sessoes.setCategoriaFilme(resultSet.getString("categoriaFilme"));
                sessoesp.add(sessoes);
            }
            return sessoesp;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Sessoes listarSessoesId(int idSessoes) {
        String sql = "SELECT * FROM sessoes WHERE idSessoes= ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, idSessoes);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()){
                Sessoes sessoes = new Sessoes();
                sessoes.setIdSessao(resultSet.getInt("idSessao"));
                sessoes.setNomeSessao(resultSet.getString("nomeSessao"));
                sessoes.setQntSessoes(resultSet.getInt("qntSessoes"));
                sessoes.setCategoriaFilme(resultSet.getString("categoriaFilme"));
                return sessoes;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
