package com.squarePatchChallenge;

import java.util.Arrays;

//2) Create a function that takes an integer and outputs an n x n square solely consisting of the integer n. 
//
//Examples 
//squarePatch(3) --> [ 
//[3, 3, 3], 
//[3, 3, 3], 
//[3, 3, 3] 
//] 
//
//squarePatch(5) --> [ 
//[5, 5, 5, 5, 5], 
//[5, 5, 5, 5, 5], 
//[5, 5, 5, 5, 5], 
//[5, 5, 5, 5, 5], 
//[5, 5, 5, 5, 5] 
//] 
//
//squarePatch(1) --> [ 
//[1] 
//] 
//
//squarePatch(0) --> [] 
//Notes 
//n >= 0. 
//If n = 0, return an empty array. 

public class Square {

	public static void squarePatch(int n) {
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
	
	public static int [][] squareArray(int n) {
		int[][] square = new int [n][];
		if (n ==0) {
			System.out.println("[]");
		}
		for (int i = 0; i < n; i++) {
			square[i] = new int[n];
			for (int j = 0; j < n; j++) {
				square[i][j] = n;
			}
			System.out.println(Arrays.toString(square[i]));
		}
		return square;
	}
	
	public static void main(String[] args) {
		
		squarePatch(3);
		System.out.println();
		squareArray(3);
		System.out.println();
		
		squarePatch(0);
		System.out.println();
		squareArray(0);
		System.out.println();
		
		squarePatch(5);
		System.out.println();
		squareArray(5);
		System.out.println();
		
		squarePatch(2);
		System.out.println();
		squareArray(2);
		System.out.println();

	}

}
