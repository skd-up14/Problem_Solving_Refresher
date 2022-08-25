package com.learn.day4;

/**
 * I have to arrays int arr1[] = {21,6,8,9,10,5}; int arr2[] = {10,21,5,8,6,9};
 * write a program to check whether both arrays are equal or not
 * 
 * @author Souvik_Das
 *
 */
public class CodingProb3Day4 {

	public static void main(String[] args) {
		
		int arr1[] = {21,6,8,9,10,5};
		int arr2[] = {10,21,5,8,6,9};
		
		printResult(areArraysEqual(arr1, arr2));

	}
	
	private static void printResult(boolean arrEqualityFlag) {
		if (arrEqualityFlag) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

	private static boolean areArraysEqual(int[] arr1, int[] arr2) {
		boolean result = true;

		if (arr1.length != arr2.length) {
			result = false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					result = false;
					break;
				}
			}

		}
		return result;
	}

}
