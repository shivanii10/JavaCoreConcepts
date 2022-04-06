package com.example.jaxrs.jaxrsapplication;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class Test {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testString() {
		return "Hi, test resource is responding";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String postString() {
		return "Hi, post method mapping is also working...";
	}
	

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String putString() {
		return "Hi, put method mapping is also working...";
	}
	
	@GET
	@Path("/ok")
	public  Response SendResponse() {
		return Response.status(400).build();
	}
	

}