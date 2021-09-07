package com.kishan.year_2021.month_sept.date_7;

import java.util.ArrayList;
import java.util.List;

/**
 * 	Given a non-negative integer num, write a program to return the number obtained after reversing the bits of num.
 *
 * 	Input: 13
 *  Output: 11
 *  Explanation: Binary representation of 13 is 1101. After reversing the bits we get 1011 which is equal to 11.
 *
 * 	Input: 6
 * 	Output: 3
 * 	Explanation: Binary representation of 6 is 110.After reversing the bits we get 011 which is equal to 3.
 *
 */
public class ReverseBits {

	public static int reverseBits(int num) {
		List<Integer> binary = getBinaryNumbers(num);
		int reverseBit = 0;
		int size = binary.size()-1;
		for(int i = size; i >= 0; i--) {
			if(binary.get(i) != 0) 	reverseBit += Math.pow(2,size-i);
		}
		return reverseBit;
	}
	/**
	 *
	 * @param num
	 * @return list
	 *
	 * 	method will convert integer to binary representation list
	 */
	private static List<Integer> getBinaryNumbers(int num) {
		List<Integer> binary = new ArrayList<>();
		while(num > 0){
			binary.add(num % 2);
			num = num / 2;
		}
		return binary;
	}

	public static void main(String[] args) {
		int num = 13;
		System.out.println("After Reverse Bits -> " + reverseBits(num));
	}
}
