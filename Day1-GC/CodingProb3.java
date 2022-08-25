package com.souvik.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodingProb3 {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("as", "123", "32", "2as");

		System.out.println(createIntegerList(ls));
	}

	private static List<Integer> createIntegerList(List<String> ls) {
		List<Integer> resultList = new ArrayList<Integer>();

		if (ls.isEmpty()) {
			return Collections.emptyList();
		}

		Loop1:for (String s : ls) {
			char[] arr = s.toCharArray();

			for (int i = 0; i < arr.length; i++) {
				if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					continue Loop1;
				}
			}
			resultList.add(Integer.valueOf(s));
			
		}
		return resultList;
	}

}
