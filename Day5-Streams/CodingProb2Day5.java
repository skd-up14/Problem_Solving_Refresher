package com.learn.day5;

/**
 * Find the first repeating element in an array of integers Input: arr[] = {6,
 * 10, 5, 4, 9, 120, 4, 6, 10} Output: 6 [6 is the first element that repeats]
 * 
 * @author Souvik_Das
 *
 */
public class CodingProb2Day5 {

	public static void main(String[] args) {
		int[] arr = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };

		findFirstDuplicate(arr);
	}

	private static void findFirstDuplicate(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println("First duplicate element is:" + arr[i]);
					temp++;
					break;
				}
			}

			if (temp > 0) {
				break;
			}
		}
	}

}
