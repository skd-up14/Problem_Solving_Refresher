package com.learn;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodingProb2Day3Java8 {

	public static void main(String[] args) {
		String input = "ABC";

		generatePermutations(input).forEach(System.out::println);;
	}

	private static Stream<String> generatePermutations(String str) {
		if (str.isEmpty()) {
			return Stream.of("");
		}
		return IntStream.range(0, str.length()).boxed()
				.flatMap(i -> generatePermutations(str.substring(0, i) + str.substring(i + 1)).map(t -> str.charAt(i) + t));
	}
}
