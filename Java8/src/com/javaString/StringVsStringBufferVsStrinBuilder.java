package com.javaString;

//Java provides three classes to represent a sequence of characters: String, StringBuffer, and StringBuilder. The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable. There are many differences between StringBuffer and StringBuilder. The StringBuilder class is introduced since JDK 1.5.

/*There are many differences between String and StringBuffer. A list of differences between String and StringBuffer are given below:

No.	String	|| StringBuffer
1)	The String class is immutable.	|| The StringBuffer class is mutable.
2)	String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance. || StringBuffer is fast and consumes less memory when we concatenate t strings.
3)	String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.	|| StringBuffer class doesn't override the equals() method of Object class.
4)	String class is slower while performing concatenation operation.	|| StringBuffer class is faster while performing concatenation operation.
5)	String class uses String constant pool.	|| StringBuffer uses Heap memory*/


//Difference between StringBuffer and StringBuilder

//1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	|| StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
//2)	StringBuffer is less efficient than StringBuilder.	|| StringBuilder is more efficient than StringBuffer.
//3)	StringBuffer was introduced in Java 1.0	|| StringBuilder was introduced in Java 1.5

//Java Program to demonstrate the performance of String and StringBuffer and StringBuilder classes.  
public class StringVsStringBufferVsStrinBuilder{  
	
  public static void main(String[] args){  
	  
	  long startTime = System.currentTimeMillis(); 
	        String t = "Java";  
	        for (int i=0; i<10000; i++){  
	            t = t + "Tpoint";  
	        }  
	  System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms"); 
 
    
	  startTime = System.currentTimeMillis();  
      StringBuffer sb = new StringBuffer("Java");  
      
      for (int i=0; i<10000; i++){  
          sb.append("Tpoint");  
      }  
      
      System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
      startTime = System.currentTimeMillis();  
      StringBuilder sb2 = new StringBuilder("Java");  
      
      for (int i=0; i<10000; i++){  
          sb2.append("Tpoint");  
      }  
      
      System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
  }  
} 