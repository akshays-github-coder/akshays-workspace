package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator
import java.lang.Comparable;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream is a new abstract layer introduced in Java 8. Using stream, you can process data in a declarative way similar to SQL statements. For example, consider the following SQL statement.

//SELECT max(salary), employee_id, employee_name FROM Employee

//The above SQL expression automatically returns the maximum salaried employee's details, without doing any computation on the developer's end. Using collections framework in Java, a developer has to use loops and make repeated checks. Another concern is efficiency; as multi-core processors are available at ease, a Java developer has to write parallel code processing that can be pretty error-prone.

//To resolve such issues, Java 8 introduced the concept of stream that lets the developer to process data declaratively and leverage multicore architecture without the need to write any specific code for it.

//What is Stream?
//Stream represents a sequence of objects from a source, which supports aggregate operations. Following are the characteristics of a Stream −

// -Sequence of elements − A stream provides a set of elements of specific type in a sequential manner. A stream gets/computes elements on demand. It never stores the elements.

// -Source − Stream takes Collections, Arrays, or I/O resources as input source.

// -Aggregate operations − Stream supports aggregate operations like filter, map, limit, reduce, find, match, and so on.

// -Pipelining − Most of the stream operations return stream itself so that their result can be pipelined. These operations are called intermediate operations and their function is to take input, process them, and return output to the target. collect() method is a terminal operation which is normally present at the end of the pipelining operation to mark the end of the stream.

// -Automatic iterations − Stream operations do the iterations internally over the source elements provided, in contrast to Collections where explicit iteration is required.

public class Streams implements Comparable<Integer>{

   public static void main(String args[]) {
      System.out.println("Using Java 7: ");
		
      // Count empty strings
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      System.out.println("List: " +strings);
      long count = getCountEmptyStringUsingJava7(strings);
		
      System.out.println("Empty Strings: " + count);
      count = getCountLength3UsingJava7(strings);
		
      System.out.println("Strings of length 3: " + count);
		
      //Eliminate empty string
      List<String> filtered = deleteEmptyStringsUsingJava7(strings);
      System.out.println("Filtered List: " + filtered);
		
      //Eliminate empty string and join using comma.
      String mergedString = getMergedStringUsingJava7(strings,", ");
      System.out.println("Merged String: " + mergedString);
      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//      System.out.println("Numbers List:: " + numbers.stream().sorted((o1,o2)->o1.getInteger().com.toList());
//      System.out.println(numbers.stream().collect(Collections.sort(numbers)));
      Collections.sort(numbers);
      for(Integer i:numbers) {
    	  System.out.println("Sorted Numbers:: " +i);
      }
		/*
		 * numbers.stream().sorted(i1,i2)->i1.com
		 * System.out.println("Sorted Numbers List :: " + sortedNum);
		 */
      List<String> items = new ArrayList<String>();
      
      items.add("one");
      items.add("two");
      items.add("three");
      
      Stream<String> stream = items.stream();
      Stream<String> longStringsStream = stream.filter((value) -> {
    	    return value.length() >= 3;
    	});
      System.out.println("longStringsStream :: " + longStringsStream.toString());
		
      //get list of square of distinct numbers
      List<Integer> squaresList = getSquares(numbers);
      System.out.println("Squares List: " + squaresList);
      List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		
      System.out.println("List: " +integers);
      System.out.println("Highest number in List : " + getMax(integers));
      System.out.println("Lowest number in List : " + getMin(integers));
      System.out.println("Sum of all numbers : " + getSum(integers));
      System.out.println("Average of all numbers : " + getAverage(integers));
      System.out.println("Random Numbers: ");
		
      //print ten random numbers
      Random random = new Random();
		
      for(int i = 0; i < 10; i++) {
         System.out.println(random.nextInt());
      }
		
      System.out.println("Using Java 8: ");
      System.out.println("List: " +strings);
		
      //The ‘filter’ method is used to eliminate elements based on a criteria. The following code segment prints a count of empty strings using filter.
      count = strings.stream().filter(string->string.isEmpty()).count();
      System.out.println("Empty Strings: " + count);
		
      count = strings.stream().filter(string -> string.length() == 3).count();
      System.out.println("Strings of length 3: " + count);
		
      filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
      System.out.println("Filtered List: " + filtered);
		
      //Collectors are used to combine the result of processing on the elements of a stream. Collectors can be used to return a list or a string.
      mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
      System.out.println("Merged String: " + mergedString);
      
      List<Product> productsList = new ArrayList<Product>();  
      //Adding Products  
      productsList.add(new Product(1,"HP Laptop",25000f));  
      productsList.add(new Product(2,"Dell Laptop",30000f));  
      productsList.add(new Product(3,"Lenevo Laptop",28000f));  
      productsList.add(new Product(4,"Sony Laptop",28000f));  
      productsList.add(new Product(5,"Apple Laptop",90000f));  
      
      List<Float> productPriceList = productsList.stream().map(x->x.price).collect(Collectors.toList()); //Consider duplicate values
      System.out.println("Product Price List :: " + productPriceList);
      
      Set<Float> productPriceSet = productsList.stream().map(x->x.price).collect(Collectors.toSet()); //Removes duplicates
      System.out.println("Product Price Set :: " +productPriceSet);
      
      Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x->x.price));
      System.out.println("Sum of Prices :: " + sumPrices);
      
      Integer sumId = productsList.stream().collect(Collectors.summingInt(x->x.id));
      System.out.println("Sum of IDs :: " + sumId);
      
      Double avgPrice = productsList.stream().collect(Collectors.averagingDouble(x->x.price));
      System.out.println("Average of Price List :: " + avgPrice);
      
      Long noOfElements = productsList.stream().collect(Collectors.counting());
      System.out.println("Total Elements :: " + noOfElements);
		
      //The ‘map’ method is used to map each element to its corresponding result. The following code segment prints unique squares of numbers using map.
      squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
      System.out.println("Squares List: " + squaresList);
      System.out.println("List: " +integers);
		
      //With Java 8, statistics collectors are introduced to calculate all statistics when stream processing is being done.
      IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
		
      System.out.println("Highest number in List : " + stats.getMax());
      System.out.println("Lowest number in List : " + stats.getMin());
      System.out.println("Sum of all numbers : " + stats.getSum());
      System.out.println("Average of all numbers : " + stats.getAverage());
      System.out.println("Random Numbers: ");
		
      //Stream has provided a new method ‘forEach’ to iterate each element of the stream. The following code segment shows how to print 10 random numbers using forEach.
      //The ‘limit’ method is used to reduce the size of the stream. The following code segment shows how to print 10 random numbers using limit.
      //The ‘sorted’ method is used to sort the stream. The following code segment shows how to print 10 random numbers in a sorted order.
      random.ints().limit(10).sorted().forEach(System.out::println);
      random.ints().limit(10).sorted().forEachOrdered(System.out::println);
		
      //parallel processing
      //parallelStream is the alternative of stream for parallel processing. Take a look at the following code segment that prints a count of empty strings using parallelStream.
      count = strings.parallelStream().filter(string -> string.isEmpty()).count();
      System.out.println("Empty Strings: " + count);
      //It is very easy to switch between sequential and parallel streams.
   }
	
   private static int getCountEmptyStringUsingJava7(List<String> strings) {
      int count = 0;

      for(String string: strings) {
		
         if(string.isEmpty()) {
            count++;
         }
      }
      return count;
   }
	
   private static int getCountLength3UsingJava7(List<String> strings) {
      int count = 0;
		
      for(String string: strings) {
		
         if(string.length() == 3) {
            count++;
         }
      }
      return count;
   }
	
   private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
      List<String> filteredList = new ArrayList<String>();
		
      for(String string: strings) {
		
         if(!string.isEmpty()) {
             filteredList.add(string);
         }
      }
      return filteredList;
   }
	
   private static String getMergedStringUsingJava7(List<String> strings, String separator) {
      StringBuilder stringBuilder = new StringBuilder();
		
      for(String string: strings) {
		
         if(!string.isEmpty()) {
            stringBuilder.append(string);
            stringBuilder.append(separator);
         }
      }
      String mergedString = stringBuilder.toString();
      return mergedString.substring(0, mergedString.length()-2);
   }
	
   private static List<Integer> getSquares(List<Integer> numbers) {
      List<Integer> squaresList = new ArrayList<Integer>();
		
      for(Integer number: numbers) {
         Integer square = new Integer(number.intValue() * number.intValue());
			
         if(!squaresList.contains(square)) {
            squaresList.add(square);
         }
      }
      return squaresList;
   }
	
   private static int getMax(List<Integer> numbers) {
      int max = numbers.get(0);
		
      for(int i = 1;i < numbers.size();i++) {
		
         Integer number = numbers.get(i);
			
         if(number.intValue() > max) {
            max = number.intValue();
         }
      }
      return max;
   }
	
   private static int getMin(List<Integer> numbers) {
      int min = numbers.get(0);
		
      for(int i= 1;i < numbers.size();i++) {
         Integer number = numbers.get(i);
		
         if(number.intValue() < min) {
            min = number.intValue();
         }
      }
      return min;
   }
	
   private static int getSum(List numbers) {
      int sum = (int)(numbers.get(0));
		
      for(int i = 1;i < numbers.size();i++) {
         sum += (int)numbers.get(i);
      }
      return sum;
   }
	
   private static int getAverage(List<Integer> numbers) {
      return getSum(numbers) / numbers.size();
   }

@Override
public int compareTo(Integer o) {
	// TODO Auto-generated method stub
	return 0;
}
}
