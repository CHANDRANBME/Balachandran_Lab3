package com.gl.BracketBalancing;


public class BrktMain {

	public static void main(String[] args) {
		test("{[()]}");
		test(" ([[{}]])) ");
		test("{}");
	}

	private static void test(String brackets) {

		BrktChecker checker = new BrktChecker(brackets);
		boolean result = checker.check();
		System.out.println("\n\t");
				
				if (result) {
			System.out.println("\t\tGiven,Bracket expression : '" + brackets
					+ "' \n\t The above expression has Balanced Brackets");
		} else {
			System.out.println("\t\tGiven,Bracket expression : '" + brackets
					+ "' \n\t The entered Strings do not contain Balanced Brackets");
		}
	}
}
