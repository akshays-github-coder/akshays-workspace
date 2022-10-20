package com.java.concepts;

//In Java 8, you can iterate a map using Map.forEach(action) method and using lambda expression. This technique is clean and fast.

//Java code illustrating iteration
//over map using forEach(action) method

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class MapHashmap
{
 public static void main(String[] arg)
 {
     Map<String,String> gfg = new HashMap<String,String>();
  
     // enter name/url pair
     gfg.put("GFG", "geeksforgeeks.org");
     gfg.put("Practice", "practice.geeksforgeeks.org");
     gfg.put("Code", "code.geeksforgeeks.org");
     gfg.put("Quiz", "quiz.geeksforgeeks.org");
      
     System.out.println("************Using forEach()********************");
     // forEach(action) method to iterate map
     gfg.forEach((k,v) -> System.out.println("Key = "
             + k + ", Value = " + v));
     
  // using iterators
     Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();
      
     System.out.println("************Using Iterators********************");
     while(itr.hasNext())
     {
          Map.Entry<String, String> entry = itr.next();
          System.out.println("Key = " + entry.getKey() +
                              ", Value = " + entry.getValue());
     }
      
 }
}
