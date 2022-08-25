package com.souvik.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CodingProb2 {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps right over the little lazy dog";

		List<String> result = new ArrayList<>();
		String[] arr = s.split("\\s");
		java.util.Queue<Integer> queue = new LinkedList<Integer>();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int c = calculateVowelCount(arr[i]);
			if (max < c) {
				max = c;
			}

			queue.add(c);
		}

		int index = 0;
		while (!queue.isEmpty()) {
			if (queue.peek() == max) {
//				System.out.print(arr[index]);
//				if(index > 0) {
//					System.out.print(", ");
//				}
				result.add(arr[index]);
			}
			index++;
			queue.poll();
		}

		System.out.println(result);

	}

	private static int calculateVowelCount(String str) {
		int cnt = 0;
		char[] carr = str.toCharArray();
		for (Character c : carr) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				cnt++;
			}
		}
		return cnt;
	}
}
