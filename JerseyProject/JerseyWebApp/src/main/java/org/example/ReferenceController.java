package org.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.sql.*;

@Path("aliens")
public class ReferenceController {

    private final AlienDb obj;

    {
        obj = new AlienDb();
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Alien> getAlien() {
        System.out.println("Hello!");
        return obj.getAliens();
    }

    @GET
    @Path("alien/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Alien getAlien(@PathParam("id") int id) {
        return AlienDb.getAlien(id);
    }

    @POST
    @Path("alien")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Alien createAlien(Alien a) {
        System.out.println(a);
        AlienDb.create(a);
        return a;
    }
}
