package com.examples.jaxrs.employeejax;
import java.util.List;

//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




/** Example resource class hosted at the URI path "/myresource"
 */

/*
@Path("/myresource")
public class MyResource {
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!";
    }
}
*/

//http://localhost:8080/employeejax/webresources/employee/test

@Path("/employee")
public class MyResource
{
    @GET
    @Path("/test")
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
    
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_XML)
    public Response getAll(){
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	List<Employee> emps = service.displayAll();
    	GenericEntity<List<Employee>> data = new GenericEntity<List<Employee>>(emps) {};
    	return Response.status(200).entity(data.getEntity()).build();
    }
    
    
    
    @POST
    @Path("/add/{id}/{name}")
   // @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_XML)
    public Response insertEmp(@PathParam("id") int id, @PathParam("name") String name)
    {
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	return Response.status(200).entity(service.insertEmployee(new Employee(id,name))).build();
    }
    
    
   /* @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteEmp(@PathParam("id") int id) {
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	return Response.accepted().entity(service.deleteEmployee(id)).build();
    } */
    
    @PUT
    @Path("/update/{id}/{name}")
    @Produces(MediaType.APPLICATION_XML)
    public Response updateEmp(@PathParam("id") int id, @PathParam("name") String name)
    {
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	return Response.status(200).entity(service.updateEmployee(new Employee(id,name))).build();
    }
    
    
/*
   @Path("/search/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Response searchEmp(@PathParam("id")int id) {
    	Employee temp=null;
    	boolean isFound=false;
    	for(Employee emps: e) {
    		if(emps.getId()==id) {
    			temp=emps;
    			break;
    		}
    	}
    	
    	if(!isFound)
    		return Response.status(200).entity("no data found").build();
    	else
    		return Response.status(200).entity(e).build();
    }
    */
    
}
  
