package com.learn.day4;

import java.util.Stack;

/**
 * Check for the balanced Brackets in an expression Input: exp =
 * “[()]{}{[()()]()}” Output: Balanced Input: exp = “[(])” Output: Not Balanced
 * 
 * @author Souvik_Das
 *
 */
public class CodingProb2Day4 {

	public static void main(String[] args) {

		printResult(isBalancedExpression("[()]{}{[()()]()}"));

		printResult(isBalancedExpression("[()"));

	}

	private static void printResult(boolean balanced) {
		if (balanced) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

	private static boolean isBalancedExpression(String input) {
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') {
				stk.push(ch);
				continue;
			}

			// When expression has only closing brackets,so no need of checking
			// further,expression is unbalanced
			if (stk.isEmpty()) {
				return false;
			}

			if (ch == ')') {
				char c = stk.pop();
				if (c == '{' || c == '[') {
					return false;
				}
			} else if (ch == '}') {
				char c = stk.pop();
				if (c == '(' || c == '[') {
					return false;
				}
			} else if (ch == ']') {
				char c = stk.pop();
				if (c == '(' || c == '{') {
					return false;
				}

			}
		}
		return stk.isEmpty();
	}
}
