package com.bishopChallenge;

public class BishopDriver {

public static void main(String[] args) {
		
		System.out.println(new Bishop("a1", "b4", 2).canFinish()); // true
		System.out.println(new Bishop("a1", "b5", 5).canFinish()); // false
		System.out.println(new Bishop("f1", "f1", 0).canFinish()); // true
	}
	
}
