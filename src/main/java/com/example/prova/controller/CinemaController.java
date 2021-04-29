package com.example.prova.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

import com.example.prova.Dao.*;
import com.example.prova.Model.Cinema;
import com.google.gson.Gson;

@Path("cinema")
public class CinemaController {

    @GET
    @Path("criartabelacinema")
    @Produces("application/json")
    public Response tabelaCinemaDao() {
        CinemaDao sDao = new CinemaDao();
        sDao.tabelaCinemaDao();
        return Response.ok(new Gson().toJson("Tabela Cinema Feita")).build();
    }
    @GET
    @Produces("application/json")
    public Response listarCinemas() {
        CinemaDao cDao = new CinemaDao();
        List<Cinema> cinema = cDao.listarCinemas();
        return Response.ok(new Gson().toJson(cinema)).build();
    }
}