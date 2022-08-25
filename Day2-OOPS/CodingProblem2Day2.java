package com.learn;

public class CodingProblem2Day2 {

	public static void main(String[] args) {
		String str = "Swa$pn&il";

		char[] strArr = str.toCharArray();
		String reversedString = reverse(strArr);
		System.out.println(reversedString);

	}

	private static String reverse(char[] str) {
		int left = 0;
		int right = str.length - 1;

		while (left < right) {
			if (!isAlphabetic(str[left])) {
				left++;
			} else if (!isAlphabetic(str[right])) {
				right--;
			} else {
				swap(str, left, right);
				left++;
				right--;
			}
		}
		return new String(str);
	}

	private static void swap(char[] arr, int left, int right) {
		Character temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	private static boolean isAlphabetic(Character ch) {
		return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
	}
}
