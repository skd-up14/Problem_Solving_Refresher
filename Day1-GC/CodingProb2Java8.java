package com.souvik.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CodingProb2Java8 {
	private static Set<Character> vowelSet = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

	public static void main(String[] args) {
		String s = "The quick brown fox jumps right over the little lazy dog";

		String[] arr = Pattern.compile("\\s").splitAsStream(s).toArray(String[]::new);
		Map<Integer, List<String>> map = Arrays.stream(arr)
				.collect(Collectors.groupingBy(CodingProb2Java8::calculateVowelCount, Collectors.toList()));

		map.get(map.keySet().stream().sorted(Comparator.reverseOrder()).findFirst().get()).stream()
				.forEach(str -> System.out.print(str + " "));

	}

	private static int calculateVowelCount(String str) {
		return (int) str.chars().filter(c -> vowelSet.contains((char) c)).count();
	}
}
