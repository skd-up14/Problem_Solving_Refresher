package com.learn;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingProb3Day3Java8 {
	public static void main(String[] args) {

		String input = "organization";
		Map<Character, Long> output = getCharOccurrences(input);

		output.forEach((k, v) -> System.out.println(k + "-" + v));

	}

	private static Map<Character, Long> getCharOccurrences(String str) {
		return str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
