package com.TextTwistChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//In Text Twist, players try to score points by forming words using the letters from a 6-letter scrambled word. They win the round if they can successfully unscramble the 6-letter word. 
//
//Create a function that takes in an array of already-guessed words, the unscrambled 6-letter word and returns the total number of points the player scored in a particular round using the following rubric: 
//
//3-letter words are 1 pt 
//4-letter words are 2 pts 
//5-letter words are 3 pts 
//6-letter words are 4 pts + 50 pt bonus (for unscrambling the word) 
//Remember that invalid words (words that cannot be formed from the 6-letter unscrambled words) count as 0 pts. 
//
//Examples 
//totalPoints(["cat", "create", "sat"], "caster") ➞ 2 
//// Since "create" is an invalid word. 
//
//totalPoints(["trance", "recant"], "recant") ➞ 108 
//// Since "trance" and "recant" score 54 pts each. 
//
//totalPoints(["dote", "dotes", "toes", "set", "dot", "dots", "sted"], "tossed") ➞ 13 
//// Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13 
//
//Notes: 
//If a 6-letter word has multiple anagrams, count each 6-letter unscramble as an additional 54 pts. For example, if the word is arches, and the player guessed arches and chaser, add 108 pts for both words. 




public class Twist {
	
	private static HashMap<Character, Integer> createKey(String answer){
		HashMap<Character, Integer> answerKey = new HashMap<>();
		for( Character c : answer.toCharArray()) {
			if (answerKey.containsKey(c)) {
				answerKey.replace(c, answerKey.get(c)+ 1);
			} else {
				answerKey.put(c, 1);
			}
		}
		
		return answerKey;
		
	}
	
	public static int scorePoints(String[] words, String originalWord) {
		int score = 0;
		
		for(String word: words) {
			boolean validWord = true;
			HashMap<Character, Integer> answerKey = createKey(originalWord);
			for (char c: word.toCharArray()) {
				if (answerKey.containsKey(c) && answerKey.get(c) > 0 ) {
					answerKey.replace(c, answerKey.get(c)-1);
				} else {
					validWord = false;
				}
			}
			if (validWord ==true) {
				score += word.length()-2;
				if (word.length() == 6) {
					score += 50;
				}
			}
			
		}
		
		return score;
	}

}
