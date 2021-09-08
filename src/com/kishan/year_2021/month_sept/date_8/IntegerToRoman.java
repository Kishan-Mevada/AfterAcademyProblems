package com.kishan.year_2021.month_sept.date_8;

import java.util.HashMap;
import java.util.Map;

/**
 * 	Convert Integer to corresponding Roman numeral
 */
public class IntegerToRoman {

	static String convertToRoman(int num){
		StringBuilder roman = new StringBuilder();

		while(num > 0){
			if(num >= 1000){
				roman.append("M");
				num = num - 1000;
			}
			else if(num >= 900){
				roman.append("CM");
				num = num - 900;
			}
			else if(num >= 500){
				roman.append("D");
				num = num - 500;
			}
			else if(num >= 400){
				roman.append("D");
				num = num - 400;
			}
			else if(num >= 100){
				roman.append("C");
				num = num - 100;
			}
			else if(num >= 90){
				roman.append("XC");
				num = num - 90;
			}
			else if(num >= 50){
				roman.append("L");
				num = num - 50;
			}
			else if(num >= 40){
				roman.append("XL");
				num = num - 40;
			}
			else if(num >= 10){
				roman.append("X");
				num = num - 10;
			}
			else if(num >= 9){
				roman.append("IX");
				num = 0;
			}
			else if(num >= 5){
				roman.append("V");
				num = num - 5;
			}
			else if(num >= 4){
				roman.append("IV");
				num = 0;
			}
			else{
				roman.append("I");
				num = num - 1;
			}
		}
		return roman.toString();
	}
	public static void main(String[] args) {
		int num = 13;
		System.out.println("Roman number -> " + convertToRoman(num));
	}
}
