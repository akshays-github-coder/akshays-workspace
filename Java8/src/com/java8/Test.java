package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =121;
		
		
		List<Integer> list = Arrays.asList(121,212,332,342);
		for(Integer ints: list) {
			ints.reverse(a);
			System.out.println(ints);
		}
		
//		List<Integer> lists = list.stream().filter(i->i.equals(i.reverse(i))).collect(Collectors.toList());
		
//				System.out.println(lists);

	}

}
