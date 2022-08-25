package com.souvik.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingProb3Java8 {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("as", "123", "32", "2as");

		System.out.println(createIntegerList(ls));
	}

	private static List<Integer> createIntegerList(List<String> ls) {
		return ls.stream().filter(CodingProb3Java8::isStringAlphabetic).map(Integer::parseInt).collect(Collectors.toList());
	}

	private static boolean isStringAlphabetic(String str) {
		return str.chars().noneMatch(c -> c >= 'a' && c <= 'z');
	}

}
