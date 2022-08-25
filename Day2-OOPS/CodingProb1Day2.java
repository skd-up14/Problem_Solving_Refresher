package com.learn;

public class CodingProb1Day2 {

	public static void main(String[] args) {
		int[] input = { 11, 23, 32, 52, 76, 81, 111, 135, 140, 170 };

		int element1 = 111;
		int index1 = getIndex(input, element1);
		System.out.println("The index of " + element1 + ":" + index1);

		int element2 = 110;
		int index2 = getIndex(input, element2);
		System.out.println("The index of " + element2 + ":" + index2);

	}

	private static int getIndex(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
