package com.logicbig.example;


//http://localhost:8080/rest-uri-path-regex/api/employees/abc check exception using this

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("orders")
public class OrderService {

    @GET
    @Path("{orderId:\\d{3,5}}")  // min 3 digit to max 5 digit
    public String getOrders(@PathParam("orderId") String orderId) {
        return "orderId: " + orderId;
    }

    @GET
    @Path("{orderId:[a-z]\\d{2,3}}")
    public String getOrders2(@PathParam("orderId") String orderId) {
        return "orderId: " + orderId;
    }
    
    @GET
    @Path("/test")
    public String testQueryParam(
            @DefaultValue("praveen")
            @QueryParam("name") String name, 
            @DefaultValue("Hyderabad")
            @QueryParam("city") String city
    		) {
        return "Name= " + name+" City  = "+city;
    }
    
    
    @GET
    @Path("/test1")
    public String testQueryParam1(
       
            @QueryParam("name") String name, 
            
            @QueryParam("city") String city
    		) {
        return "Name= " + name+" City  = "+city;
    }
}