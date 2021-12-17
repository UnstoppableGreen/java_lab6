package ru.rsatu.resources;

import ru.rsatu.pojo.Gift;
import ru.rsatu.service.SantaClausService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/gift")
public class GiftResources {
    @Inject
    SantaClausService sr;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getGift")
    public Response getGift(){
        return Response.ok(sr.getGift()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/insertGift")
    public Response insertGift(Gift gift){
        return Response.ok(sr.insertGift(gift)).build();
    }
}
