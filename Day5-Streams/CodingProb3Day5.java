package com.learn.day5;

/**
 * Find the index/position of an element in a multidimensional array.
 * 
 * 
 * Input: mat[4][4] = 
 * 
 * {{10, 20, 30, 40},
 * 
 * {15, 25, 35, 45},
 * 
 * {27, 29, 37, 48},
 * 
 * {32, 33, 39, 50}}
 * 
 * x = 29
 * 
 * Output: Found at (2, 1).
 * 
 * @author Souvik_Das
 *
 */
public class CodingProb3Day5 {

	public static void main(String[] args) {

		int mat[][] = new int[][] { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		int x = 29;

		search(mat, x);
	}

	private static void search(int[][] mat, int x) {
		int i = 0;
		int j = mat[0].length - 1;

		while (i < mat.length && j >= 0) {
			if (x == mat[i][j]) {
				System.out.println("(" + i + "," + j + ")");
				return;
			} else if (x < mat[i][j]) {
			} else {
			}
		}
		System.out.println("Not present");
	}

}
