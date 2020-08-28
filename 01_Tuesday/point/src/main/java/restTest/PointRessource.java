/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restTest;

import Facade.Facade;
import entity.Point;
import java.util.List;
import javax.json.Json;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author David
 */
@Path("/point")
public class PointRessource {
    //Gson gson = new JsonBuilder().setPrettyPrinting().create();
    Facade facade = new Facade();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public PointRessource() {
    }

    /**
     * Retrieves representation of an instance of restTest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        //TODO return proper representation object
        return "{\"message\":\"Hello\"}";
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPoints(){
        List<Point> points = facade.getAll();
       // String jsonout = gson.toJson(points);
        return Response.ok().entity(points).build();
    }
    
    @GET
    @Path("/PathDemo/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMsg() {
        return "{\"msg\": \"Hello";
    }
    
    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    * */
}
