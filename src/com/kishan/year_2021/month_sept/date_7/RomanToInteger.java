package com.kishan.year_2021.month_sept.date_7;

import java.util.HashMap;
import java.util.Map;

/**
 * 	Given a string s representing a roman numeral. Convert s into an integer.
 *
 * 		SYMBOL       VALUE
 * 		I             1
 *		V             5
 * 		X             10
 * 		L             50
 * 		C             100
 * 		D             500
 * 		M             1000
 *
 * 		Input: "VII"
 * 		Output: 7
 * 		Explanation: V+I+I = 5+1+1 = 7
 *
 * 		Input: "IV"
 * 		Output: 4
 * 		Explanation: The value of I is 1 which is smaller than the value of V i.e. 5. So, we subtract I from V. V-I = 5-1 = 4
 *
 * 		Input: "XC"
 * 		Output: 90
 * 		Explanation: The value of X is 10 which is smaller than the value of C i.e. 100. So, we subtract X from C. C-X = 100-10 = 90
 */
public class RomanToInteger {
	//map created to keep roman to integer number as key value pair
	private static final Map<Character,Integer> romanToIntMap;

	//Initializing map
	static {
		romanToIntMap = new HashMap<>();
		romanToIntMap.put('I',1);
		romanToIntMap.put('V',5);
		romanToIntMap.put('X',10);
		romanToIntMap.put('L',50);
		romanToIntMap.put('C',100);
		romanToIntMap.put('D',500);
		romanToIntMap.put('M',1000);
	}

	static int convert(String roman){
		int num = 0;
		int[] nums = new int[roman.length()];
		for(int i = 0; i < roman.length(); i++) {
			nums[i] = romanToIntMap.get(roman.charAt(i));
		}
		for(int i = 0; i < nums.length; i++) {
			if(i < nums.length-1 && nums[i] < nums[i+1]){
				num -= nums[i];
			}
			else{
				num += nums[i];
			}
		}

		return num;
	}
	public static void main(String[] args) {
		String roman = "XC";
		System.out.println("Convert Roman to Integer -> " + convert(roman));
	}
}
