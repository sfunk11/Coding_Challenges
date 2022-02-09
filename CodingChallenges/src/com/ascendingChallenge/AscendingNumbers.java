package com.ascendingChallenge;

public class AscendingNumbers {
	
//	1) Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers. 
//
//	Examples 
//	ascending("232425") --> true 
//	// Consecutive numbers 23, 24, 25 
//
//	ascending("2324256") --> false 
//	// No matter how this string is divided, the numbers are not consecutive. 
//
//	ascending("444445") --> true 
//	// Consecutive numbers 444 and 445. 
//	Notes 
//	A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them. 

	public static boolean ascending(String numString) {
		
		int digits = 1; 
		int previous;
		int current;
		int len = numString.length();
		
		while (digits <= len/2) {
			if (len % digits == 0) {
				previous = Integer.parseInt(numString.substring(0,digits));
				for (int i = digits; i < len; i+=digits) {
					current = Integer.parseInt(numString.substring(i, digits + i));
					if (previous <= current) {
						if (i == len - digits) {
							return true;
						}
						previous = current;
					} else {
						break;
					}
				}
			}
					
			digits ++;	
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ascending("232425"));
		System.out.println(ascending("2324256"));
		System.out.println(ascending("444445"));
	
	}
}
