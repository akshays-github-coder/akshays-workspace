package com.java.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {
	
	//Approach 1
	//Naive Approach
	//In this approach we’ll start checking each roman symbol from left to right keeping in mind the things about roman numerals as stated above.
	public static final int romanToInteger(String roman) {

		int number = 0;
		for (int i = 0; i < roman.length(); i++) {
			char c = roman.charAt(i);
			switch (c) {
			case 'I':
				number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X'))
						? number - 1
						: number + 1;
				break;
			case 'V':
				number += 5;
				break;
			case 'X':
				number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C'))
						? number - 10
						: number + 10;
				break;
			case 'L':
				number += 50;
				break;
			case 'C':
				number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M'))
						? number - 100
						: number + 100;
				break;
			case 'D':
				number += 500;
				break;
			case 'M':
				number += 1000;
				break;
			}
		}

		return number;
	}
	
	//Approach 2
	//Improvement using Map
	//We can further enhance our code to remove the switch statement in our code by saving roman numerals and their number values in Map
	public static final int romanToInteger2(String s) {

		Map<Character, Integer> values = new LinkedHashMap<>();
		values.put('I', 1);
		values.put('V', 5);
		values.put('X', 10);
		values.put('L', 50);
		values.put('C', 100);
		values.put('D', 500);
		values.put('M', 1000);

		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i+1 == s.length() || values.get(s.charAt(i)) >= values.get(s.charAt(i + 1))) {
				number += values.get(s.charAt(i));
			} else {
				number -= values.get(s.charAt(i));
			}
		}
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println(romanToInteger("CXXIX"));
	}

}
