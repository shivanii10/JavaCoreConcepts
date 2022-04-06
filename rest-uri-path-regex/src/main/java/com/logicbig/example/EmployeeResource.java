package com.logicbig.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/employees")
public class EmployeeResource {

  @GET
  @Path("{id}")
  public String getEmployeeId(@PathParam("id") String employeeId) {
	  
	  return EmployeeService.Instance.getEmployeeById(employeeId);
	  
	  
  }
}
