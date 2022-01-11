package com.bishopChallenge;


/*Weekly Coding Challenge: Bishop Challenge: 

Your chess teacher wants to know if a bishop can reach a certain spot on the board in the given amount of moves. 
Given a starting square start, ending square end and the maximum number of moves allowed n. Return true if the ending square can be reached from the starting square within the given amount of moves. Keep in mind the chessboard goes from a1 to h8 (8x8). 
Examples 
<code>bishop("a1", "b4", 2) ➞ truebishop("a1", "b5", 5) ➞ falsebishop("f1", "f1", 0) ➞ true</code>Notes 
Chessboard is always empty (only the bishop is there).
Bishop can move in any direction diagonally.
If the starting and ending square are the same, return true (even if the move is 0).
Square names will always be lowercase and valid.*/

public class Bishop {

	private String start;
	private String end;
	private int moves;
	
	public Bishop(String start, String end, int moves) {
		super();
		this.start = start;
		this.end = end;
		this.moves = moves;
	}
	
	public boolean canFinish() {
		if (start.equals(end))
			return true;
		
		int currentX = start.toCharArray()[0]-48;
		int currentY = start.toCharArray()[1];
		int endX = end.toCharArray()[0]-48;
		int endY = end.toCharArray()[1];
		
		//bishops can only travel same color. if the current square is light, but end square is dark, then it cannot reach it. 
		//Any square that is the same color can be reached in 2 moves or 1 if it is on the same diagonal.
		if (currentX % 2 != currentY%2 || endX%2 != endY%2) {
			return false;
		} else {
			if (Math.abs(currentX - endX) == Math.abs(currentY - endY)) {
				if (moves > 0) return true;
			} else {
				if (moves > 1) return true;
			}
		}
		return false;
	}
	
}
