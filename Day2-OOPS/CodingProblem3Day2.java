package com.learn;

public class CodingProblem3Day2 {

	public static void main(String[] args) {
		String input = "I am interested to grow in my organization";
		
		System.out.println(longestWord(input));
	}

	private static String longestWord(String str) {
		String longestWord = "";

		for (String word : str.split("\\s")) {
			if (word.length() >= longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}
}
