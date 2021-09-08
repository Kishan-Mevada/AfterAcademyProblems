package com.kishan.year_2021.month_sept.date_8;

/**
 * 	Convert Integer to Binary
 * 	8 bit representation
 */
public class IntegerToBinary {

	static String convertToBinary(int num){
		StringBuilder sb = new StringBuilder();

		while(num > 0){
			sb.insert(0,num % 2);
			num = num / 2;
		}
		for(int i = sb.length(); i < 8; i++) {
			sb.insert(0,0);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		int num = 11;
		System.out.println("Integer to Binary -> " + convertToBinary(num));
	}
}
