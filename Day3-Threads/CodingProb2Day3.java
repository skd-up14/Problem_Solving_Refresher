package com.learn;

import java.util.HashMap;
import java.util.Map;

public class CodingProb2Day3 {

	public static void main(String[] args) {
		String input = "ABC";

		Map<Character, Integer> map = getCharacterFreqMap(input);

		generatePermutations(1, input.length(), map, "");
	}

	private static void generatePermutations(int currPosition, int totalPositions, Map<Character, Integer> fmap,
			String answerSoFar) {

		if (currPosition > totalPositions) {
			System.out.println(answerSoFar);
			return;
		}

		for (char ch : fmap.keySet()) {
			if (fmap.get(ch) > 0) {
				fmap.put(ch, fmap.get(ch) - 1);
				generatePermutations(currPosition + 1, totalPositions, fmap, answerSoFar + ch);
				fmap.put(ch, fmap.get(ch) + 1);
			}

		}

	}

	private static Map<Character, Integer> getCharacterFreqMap(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		return map;
	}

}
