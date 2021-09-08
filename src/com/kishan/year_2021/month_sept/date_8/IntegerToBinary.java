package com.kishan.year_2021.month_sept.date_8;

/**
 * 	Convert Integer to Binary
 * 	8 bit representation
 */
public class IntegerToBinary {
	private static final int BASE = 8;
	static String convertToBinary(int num){
		StringBuilder sb = new StringBuilder();

		while(num > 0){
			sb.insert(0,num % 2);
			num = num / 2;
		}
		for(int i = sb.length(); i < BASE; i++) {
			sb.insert(0,0);
		}
		return sb.toString();
	}

	static String convertBinaryRec(int num){
		StringBuilder sb = new StringBuilder(convertRec(num));
		for(int i = sb.length(); i < BASE; i++) {
			sb.insert(0,0);
		}
		return sb.toString();
	}

	private static String convertRec(int num){
		if(num == 0){
			return "0";
		}
		return convertRec(num/2) + (num % 2);
	}

	public static void main(String[] args) {
		int num = 11;
		System.out.println("Integer to Binary -> " + convertToBinary(num));
		System.out.println("Integer to Binary -> " + convertBinaryRec(num));
	}
}
