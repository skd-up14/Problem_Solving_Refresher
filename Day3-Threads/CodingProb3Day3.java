package com.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CodingProb3Day3 {
	public static void main(String[] args) {

		String input = "organization";
		Map<Character, Integer> output = getCharOccurrences(input);

		for (Entry<Character, Integer> entry : output.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

	private static Map<Character, Integer> getCharOccurrences(String str) {
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
