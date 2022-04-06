package com.example.jaxrs.jaxrsapplication;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl {
	static List<Employee> emps;
	static {
		emps = new ArrayList();
		emps.add(new Employee(1002, "kumar"));
		emps.add(new Employee(1003, "sunil"));
		emps.add(new Employee(1004, "jadav"));
	}

	public List<Employee> displayAll() {

		return emps;
	}

	public Employee insertEmployee(Employee emp) {

		emps.add(emp);
		return emp;
	}

	public String deleteEmployee(int id) {
		boolean result = false;
		List<Employee> emps = displayAll();
		for (Employee e : emps) {
			if (e.getId() == id)
				emps.remove(id);
				result = true;
		}
		if (result)
			return "Record deleted....";
		else
			return "Record Not found";
	}

	public Employee updateEmployee(Employee emp) {
		boolean result=false;
		List<Employee> emps = displayAll();
		for (Employee e : emps) {
			if (e.getId() == emp.getId())
				e.setName(emp.getName());
				result = true;
		}
		return emp;
	}

}