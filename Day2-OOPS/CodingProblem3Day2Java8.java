package com.learn;

import java.util.Arrays;

public class CodingProblem3Day2Java8 {

	public static void main(String[] args) {
		String input = "I am interested to grow in my organization";

		System.out.println(longestWord(input));
	}

	private static String longestWord(String str) {
		return Arrays.stream(str.split("\\s")).reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2).get();
	}
}
