package com.cwa.restful.ws.versioning;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PersonV2 {
	private Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	
}
