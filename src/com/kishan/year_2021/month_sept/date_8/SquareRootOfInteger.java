package com.kishan.year_2021.month_sept.date_8;

/**
 * 	Write a program to compute and return the square root of an integer num.
 * 	Input: 4
 *  Output: 2
 *  Explanation: The square root of 4 is 2 as it is a perfect square.
 *
 *  Input: 11
 * 	Output: 3
 * 	Explanation: The square root of 11 is 3.3166….., and since 11 is not a perfect square, then return only integer part of it.
 *
 */
public class SquareRootOfInteger {

	static int sqrt(int num){
		int left = 0, right = (num/2) + 1;

		while(left < right){
			int mid = left + (right - left) / 2 + 1 ;
			int square = mid*mid;

			if(square == num){
				return mid;
			}

			if(square < num){
				left = mid;
			}
			else{
				right = mid - 1;
			}
		}
		return left;
	}


	public static void main(String[] args) {
		int num = 13;
		System.out.println("Square root of " + num + " -> " + sqrt(num));
	}
}
