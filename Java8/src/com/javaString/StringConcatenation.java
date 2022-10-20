package com.javaString;

public class StringConcatenation {

	public static void main(String args[]){  

		// 1) String Concatenation by + (String concatenation) operator

		String s="Sachin"+" Tendulkar";  
		System.out.println(s);//Sachin Tendulkar

		/*
		 * The Java compiler transforms above code to this: String s=(new
		 * StringBuilder()).append("Sachin").append(" Tendulkar).toString();
		 * 
		 * In Java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method. String concatenation operator produces a new String by appending the second operand onto the end of the first operand.
		 */

		//The String concatenation operator can concatenate not only String but primitive values also.
		//Note: After a string literal, all the + will be treated as string concatenation operator.

		String s1=50+30+"Sachin"+40+40;  
		System.out.println(s1);//80Sachin4040  

		// 2) String Concatenation by concat() method

	}

}
