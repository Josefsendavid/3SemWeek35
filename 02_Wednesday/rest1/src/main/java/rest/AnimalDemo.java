package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.AnimalNoDB;

/**
 * REST Web Service
 *
 * @author David
 */
@Path("/animal")
public class AnimalDemo {
    
    @Context
    private UriInfo context;
    private static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    /**
     * Creates a new instance of AnimalDemo
     */
    public AnimalDemo() {
    }

    /**
     * Retrieves representation of an instance of rest.AnimalDemo
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getJson() {
        //TODO return proper representation object
        return "Vuf...";
    }

    @GET
    @Path("/animal_list")
    @Produces(MediaType.APPLICATION_JSON)
    public String animalList() {
        return "[\"Dog\", \"Cat\", \"Mouse\", \"Bird\"]";
    }

    @GET
    @Path("/animal")
    @Produces(MediaType.APPLICATION_JSON)
    public String animal() {
        AnimalNoDB a1 = new AnimalNoDB("Hund", "Vuf");
        AnimalNoDB a2 = new AnimalNoDB("Kat", "Miav");
        AnimalNoDB a3 = new AnimalNoDB("Ko", "Muuh");
        String jsonString1 = GSON.toJson(a1);
        String jsonString2 = GSON.toJson(a2);
        String jsonString3 = GSON.toJson(a3);
        
        
        return jsonString1 + "\n" + jsonString2 + "\n" + jsonString3;
    }

    /**
     * PUT method for updating or creating an instance of AnimalDemo
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
