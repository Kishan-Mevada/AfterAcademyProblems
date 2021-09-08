package com.kishan.year_2021.month_sept.date_8;

import java.util.Arrays;

/**
 * 	1 2
 * 	3 4
 *
 * 	3 1
 * 	4 2
 */
public class MatrixRotation {

	static void rotate(int[][] matrix){
		int length = matrix.length;
		for(int i = 0; i < Math.ceil(length / 2); i++) {
			for(int j = i; j < length - i - 1; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[length-1-j][i];
				matrix[length-1-j][i] = matrix[length-1-i][length - 1 - j];
				matrix[length-1-i][length - 1 - j] = matrix[j][length-1-i];
				matrix[j][length-1-i] = temp;
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		System.out.println(Arrays.deepToString(matrix));
		rotate(matrix);
	}
}
