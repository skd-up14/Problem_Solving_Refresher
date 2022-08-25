package com.learn.day4;

import java.util.Arrays;

/**
 * Given two arrays of integers, compute the pair of values (one value in each
 * array) with the smallest (non-negative) difference. Return the difference.
 * Input : A[] = {l, 3, 15, 11, 2}, B[] = {23, 127, 235, 19, 8}, Output : 3 the pair is: 11, 8
 * 
 * 
 * @author Souvik_Das
 *
 */
public class CodingProb1Day4 {

	public static void main(String[] args) {
		int a[] = { 1, 3, 15, 11, 2 };
		int b[] = { 23, 127, 235, 19, 8 };

		int minDiff = getMinDiffArrays(a, b);
		System.out.println(minDiff);

	}

	private static int getMinDiffArrays(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int min = Integer.MAX_VALUE;

		int firstPtr = 0;
		int secondPtr = 0;

		while (firstPtr < arr1.length && secondPtr < arr2.length) {
			if (min > Math.abs(arr1[firstPtr] - arr2[secondPtr])) {
				min = Math.abs(arr1[firstPtr] - arr2[secondPtr]);
			}

			if (arr1[firstPtr] > arr2[secondPtr]) {
				secondPtr++;
			} else {
				firstPtr++;
			}
		}

		return min;
	}

}
