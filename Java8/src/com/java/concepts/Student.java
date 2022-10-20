package com.java.concepts;

import java.io.Serializable;  

public class Student implements Serializable{  
	
	//During the serialization, when we do not want an object to be serialized we can use a transient keyword.
	transient int id;  ////Now it will not be serialized    
	String name;  
	
	public Student(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
}  

//In the above example, Student class implements Serializable interface. Now its objects can be converted into stream. The main class implementation of is showed in the next code.

