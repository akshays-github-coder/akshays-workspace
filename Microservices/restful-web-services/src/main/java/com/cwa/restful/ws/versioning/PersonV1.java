package com.cwa.restful.ws.versioning;

public class PersonV1 {
	private String name;
	
	//no argument constructor
	public PersonV1() {
		
	}

	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
