package com.TextTwistChallenge;

public class TwistDtriver {

	public static void main(String[] args) {
		
		System.out.println(Twist.scorePoints(new String[]{"cat", "create", "sat"}, "caster"));
		System.out.println(Twist.scorePoints(new String[]{"trance", "recant"}, "recant"));
		System.out.println(Twist.scorePoints(new String[] {"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed"));
	}

}
