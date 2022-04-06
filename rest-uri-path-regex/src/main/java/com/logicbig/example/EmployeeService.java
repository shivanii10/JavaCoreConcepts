package com.logicbig.example;

public enum EmployeeService {
	  Instance;

	  public String getEmployeeById(String id) {
	      try {
	          long l = Long.parseLong(id);
	          //just a dummy response
	          return "employee" + l;
	      } catch (NumberFormatException e) {
	          throw new InvalidIdException("Employee id is not valid, " + id);
	      }

	  }
}
