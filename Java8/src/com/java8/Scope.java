package com.java8;

//Scope

//Using lambda expression, you can refer to any final variable or effectively final variable (which is assigned only once). Lambda expression throws a compilation error, if a variable is assigned a value the second time.

public class Scope {

	   final static String salutation = "Hello! ";
	   
	   public static void main(String args[]) {
	      GreetingService greetService1 = message -> 
	      System.out.println(salutation + message);
	      greetService1.sayMessage("Mahesh");
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	}