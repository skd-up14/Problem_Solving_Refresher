package com.souvik.programs;

public class CodingProb1 {

	public static void main(String[] args) {

		int[] inputArr = { 15, 10, 16, 20, 8, 9, 7, 50 };
		int[] outputArr = ngettr(inputArr);

		for (int i = 0; i < outputArr.length; i++) {
			System.out.println(inputArr[i] + "->" + outputArr[i]);
		}
	}

	public static int[] ngettr(int[] inputArr) {

		int[] outputArr = new int[inputArr.length];

		java.util.Stack<Integer> stk = new java.util.Stack<Integer>();

		stk.push(inputArr[inputArr.length - 1]);
		outputArr[inputArr.length - 1] = -1;

		for (int i = inputArr.length - 2; i >= 0; i--) {
			while (stk.size() > 0 && inputArr[i] > stk.peek()) {
				stk.pop();
			}

			if (stk.size() == 0) {
				outputArr[i] = -1;
			} else {
				outputArr[i] = stk.peek();
			}

			stk.push(inputArr[i]);

		}

		return outputArr;
	}

}
