package com.java.concepts;

import java.io.*;  

public class Deserialization{  
	public static void main(String args[]){  
		try{  
			//Creating stream to read the object  
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("byte-stream.txt"));  
			Student s=(Student)in.readObject();  
			//printing the data of the serialized object  
			System.out.println(s.id+" "+s.name);  
			//closing the stream  
			in.close();  
		}catch(Exception e){System.out.println(e);}  
	}  
}  

//As you can see, printing id returns 0 because value of id was not serialized.