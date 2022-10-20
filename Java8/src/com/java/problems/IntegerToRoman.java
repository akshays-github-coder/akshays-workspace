
package com.java.problems;

class IntegerToRoman {

	public static String intToRoman(int num) {

		String romans[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int value[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		int seqSize = romans.length;
		int idx = seqSize - 1;
		String ans = "";
		while (num > 0) {
			while (value[idx] <= num) {
				ans += romans[idx]; // +=, for adding left operand with right operand and then assigning it to the
				// variable on the left
				num -= value[idx]; // -=, for subtracting right operand from left operand and then assigning it to
				// the variable on the left
			}
			idx--;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(intToRoman(4));
	}
}

// https://codingnconcepts.com/java/integer-to-roman/