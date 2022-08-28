package com.learn.day5;

/**
 * Given two sorted arrays, the task is to merge them in a sorted manner.
 * 
 * Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
 * Output: arr3[] = {1, 2,3, 4, 4, 5, 6, 8}
 * 
 * @author Souvik_Das
 *
 */
public class CodingProb1Day5 {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 5 };
		int[] b = { 2, 4, 6, 8 };

		int[] result = mergeSortedArrays(a, b);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static int[] mergeSortedArrays(int[] a, int[] b) {

		int[] result = new int[a.length + b.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				result[k] = a[i];
				i++;
				k++;
			} else {
				result[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < a.length) {
			result[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			result[k] = b[j];
			j++;
			k++;
		}

		return result;
	}

}
