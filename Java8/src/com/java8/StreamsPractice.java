package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

	public static void main(String[] args) {
		
		
	      
	      
	      List<String> stringList = new ArrayList<String>();
	      
	      stringList.add("One flew over the cuckoo's nest");
	      stringList.add("To kill a muckingbird");
	      stringList.add("Gone with the wind");
	       
	      Stream<String> stream = stringList.stream();
	       
	      stream.flatMap((value) -> {
	          String[] split = value.split(" ");
	          return (Stream<String>) Arrays.asList(split).stream();
	      })
	      .forEach((value) -> System.out.println(value));
	      
	      List<String> stringList1 = new ArrayList<String>();
	      
	      stringList1.add("one");
	      stringList1.add("two");
	      stringList1.add("three");
	      stringList1.add("one");
	      
	      System.out.println("********distinct()*****************");
	      System.out.println(stringList1.stream().distinct().collect(Collectors.toList()));
	      
	      System.out.println("********limit()*****************");
	      System.out.println(stringList1.stream().limit(2).collect(Collectors.toList()));
	      
	      List<String> names = Arrays.asList("Jon", "Ajeet", "Steve", "Ajeet", "Jon", "Ajeet");
	      Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	      System.out.println("Java – Stream Collectors groupingBy and counting Example");
	      System.out.println(map);
	}

}
