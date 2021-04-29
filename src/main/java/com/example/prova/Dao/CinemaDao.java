package com.example.prova.Dao;


import com.example.prova.Factory.ConnectionFactory;
import com.example.prova.Model.Cinema;
import com.example.prova.Model.Sessoes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CinemaDao {

    private Connection connection;

    public CinemaDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void tabelaCinemaDao() {
        String sql = "CREATE TABLE IF NOT EXISTS cinemas (" +
                "idCinema INT PRIMARY KEY AUTO_INCREMENT," +
                "nomeCinema VARCHAR(50) NOT NULL," +
                "qntSessoes INT" +
                ");";
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.execute();
            stmt.close();

            System.out.println("Tabela Cinema Criada");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Cinema> listarCinemas() {
        String mysql = "SELECT * FROM cinemas";

        try {
            PreparedStatement pstmt = connection.prepareStatement(mysql);
            ResultSet resultSet = pstmt.executeQuery();

            List<Cinema> cinemas = new ArrayList<>();
            Cinema cinema;

            while (resultSet.next()) {
                cinema = new Cinema();
                cinema.setIdCinema(resultSet.getInt("idCinema"));
                cinema.setNomeCinema(resultSet.getString("nomeCinema"));
                cinema.setQntSessoes(resultSet.getInt("qntSessoes"));

                cinemas.add(cinema);
            }
            return cinemas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}