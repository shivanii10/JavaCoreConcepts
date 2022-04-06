package com.example.jaxrs.jaxrsapplication;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	
	int id;
	String name;
	public Employee() {
		
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@XmlElement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}