package com.kishan.year_2021.month_sept.date_8;

/**
 * Given two non-negative integers num1 and num2, write a program to find the greatest common divisor (GCD) of both the numbers.
 */
public class FindGCD {

	static int gcd(int n1,int n2){
		if(n2 == 0){
			return n1;
		}
		return gcd(n2,n1 % n2);
	}
	public static void main(String[] args) {
		int n1 = 54,n2 = 24;
		System.out.println("Greatest Common divisor -> " + gcd(n1,n2));
	}
}
