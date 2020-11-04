package de.pdbm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class StarterResource {
	
	static final String HELLO_WORLD = "hello world!"; 

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	return HELLO_WORLD;
    }
    
}