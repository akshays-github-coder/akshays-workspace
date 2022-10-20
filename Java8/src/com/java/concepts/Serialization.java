package com.java.concepts;

import java.io.*; 

/*Serialization in Java is a mechanism of writing the state of an object into a byte-stream. 

The reverse operation of serialization is called deserialization where byte-stream is converted into an object.

For serializing the object, we call the writeObject() method of ObjectOutputStream class, and for deserialization we call the readObject() method of ObjectInputStream class.

We must have to implement the Serializable interface for serializing the object.*/

//In this example, we are going to serialize the object of Student class from above code. The writeObject() method of ObjectOutputStream class provides the functionality to serialize the object. We are saving the state of the object in the file named f.txt.

class Serialization{    
	public static void main(String args[]){    
		try{    
			//Creating the object    
			Student s1 =new Student(211,"ravi");    
			//Creating stream and writing the object    
			FileOutputStream fout=new FileOutputStream("byte-stream.txt");   
			
			//The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream. Only objects that support the java.io.Serializable interface can be written to streams.
			ObjectOutputStream out=new ObjectOutputStream(fout);    
			
			out.writeObject(s1);    //It writes the specified object to the ObjectOutputStream.
			
			out.flush();    //It flushes the current output stream.
			
			//closing the stream    
			out.close();    //	It closes the current output stream.
			System.out.println("success");    
		}catch(Exception e){System.out.println(e);}    
	}    
}    