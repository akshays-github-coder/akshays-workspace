package com.cwa.restful.ws.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {

	public String message;
	
	public HelloWorldBean(String message) {
		this.message=message;
	}
	
	
}
