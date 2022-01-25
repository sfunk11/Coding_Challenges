package com.PinChallenge;

//Java: 
//
//Create a function that will test if a string is a valid PIN or not via a regular expression. 
//
//A valid PIN has: 
//
//Exactly 4 or 6 characters. 
//Only numeric characters (0-9). 
//No whitespace. 
//Examples 
//validate("121317") ➞ true 
//
//validate("1234") ➞ true 
//
//validate("45135") ➞ false 
//
//validate("89abc1") ➞ false 
//
//validate("900876") ➞ true 
//
//validate(" 4983") ➞ false 
//
//Notes: 
//Empty strings should return 'false' when tested. 

public class PinChallenge {
	
	public static boolean validatePin(String pin) {
		
		return pin.matches("^[0-9]{4}|[0-9]{6}$");
	}
	
	public static void main (String[] args) {
		System.out.println (validatePin("121317"));
		System.out.println (validatePin("1234"));
		System.out.println (validatePin("45135"));
		System.out.println (validatePin("89abc1"));
		System.out.println (validatePin("900876"));
		System.out.println (validatePin(" 4983"));
		System.out.println (validatePin(""));
	}
	
}
