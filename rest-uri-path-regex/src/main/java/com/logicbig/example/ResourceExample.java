package com.logicbig.example;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/default")
public class ResourceExample {

  @GET
  @Path("test")
  public String testQueryParam() {
          
      return "query param value= ";
  }
}
