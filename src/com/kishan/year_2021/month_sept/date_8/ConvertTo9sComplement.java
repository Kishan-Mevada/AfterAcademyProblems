package com.kishan.year_2021.month_sept.date_8;

import java.util.Arrays;

/**
 * 	9’s complement of a decimal number
 * 	We traverse digits of number and subtract every digit from 9.
 */
public class ConvertTo9sComplement {
	static void convert(String number){
		char[] numChar = number.toCharArray();
		for(int i = 0; i < numChar.length; i++) {
			if(numChar[i] != '.'){
				numChar[i] = Character.forDigit(9 - Character.getNumericValue(numChar[i]),10);
			}

		}
		System.out.println("9's Complement of " + number +" -> " + String.valueOf(numChar));
	}
	public static void main(String[] args) {
		convert("22");
		convert("125.55");
	}
}
