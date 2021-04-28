package com.example.prova.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

import com.example.prova.Dao.*;
import com.example.prova.Model.Sessoes;
import com.google.gson.Gson;

@Path("sessoes")
public class SessoesController {

    @GET
    @Path("criartabelasessoes")
    @Produces("application/json")
    public Response tableSessoesDao() {
        SessoesDao sDao = new SessoesDao();
        sDao.tableSessoesDao();
        return Response.ok(new Gson().toJson("Sessoes Criada")).build();
    }
    @GET
    @Produces("application/json")
    public Response listarSessoes() {
        SessoesDao sDao = new SessoesDao();
        List<Sessoes> sessao = sDao.listarSessoes();
        return Response.ok(new Gson().toJson(sessao)).build();
    }
}
