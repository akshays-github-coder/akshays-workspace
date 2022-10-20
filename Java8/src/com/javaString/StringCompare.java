package com.javaString;

public class StringCompare {
	
	 public static void main(String args[]){  
		 String s1="Sachin";  
		   String s2="SACHIN";  
		   String s3=new String("Sachin");  
		   String s4="Sachin"; 
		  
		   System.out.println(s1.equals(s2));//false  
		   System.out.println(s1.equalsIgnoreCase(s2));//true  
		   
		   System.out.println(s1==s4);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
		   
			/*
			 * The String class compareTo() method compares values lexicographically and
			 * returns an integer value that describes if first string is less than, equal
			 * to or greater than second string.
			 * 
			 * Suppose s1 and s2 are two String objects. If:
			 * 
			 * s1 == s2 : The method returns 0. 
			 * s1 > s2 : The method returns a positive value.
			 * s1 < s2 : The method returns a negative value.
			 */
		   
		   String c1="Sachin";  
		   String c2="Sachin";  
		   String c3="Ratan";  
		   System.out.println(c1.compareTo(c2));//0  
		   System.out.println(c1.compareTo(c3));//1(because s1>s3)  
		   System.out.println(c3.compareTo(c1));//-1(because s3 < s1 )  
		 }

}
