package com.prakash.arrayz;

public class ArrayDemo {

	/*
	 * have anic eday
	 */

	public static void main(String[] args) {

		int row = 3;
		int column = 4;

		String inputStr = "have a nice day";
		inputStr=inputStr.replaceAll(" ", "");
		Math.sqrt(inputStr.length());

		String s[][] = new String[row][column];

		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				s[i][j] = String.valueOf(inputStr.charAt(count));
				count++;
			}
		}
		printMatrix(s, row, column);
	}

	private static void printMatrix(String[][] s, int row, int column) {
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(s[j][i]);
			}
			System.out.print(" ");
		}

		//[0][0] [1][0] [2][0]    -  [0][1] [1][1] [2][1]
		
	}

}
