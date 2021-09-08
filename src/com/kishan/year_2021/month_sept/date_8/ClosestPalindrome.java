package com.kishan.year_2021.month_sept.date_8;

/**
 * 	Given an integer num, write a program to find the closest palindrome to integer num. (excluding num).
 * 	The output need not be larger than num. It can be smaller or larger than num.
 *
 * 	Input: "99"
 * 	Output: "101"
 * 	Explanation: "88" and "101" are two nearest integers which are palindrome. But "101" is the answer because the absolute difference is minimum between "99" and "101".
 */
public class ClosestPalindrome {

	static int closestPalindrome(int num){

		int i = 1;
		while(true){
			if(isPalindrome(num-i) && isPalindrome(num+i)){
				return num-i;
			}
			else if(isPalindrome(num-i)){
				return num-i;
			}
			else if(isPalindrome(num+i)){
				return num+i;
			}
			i++;
		}
	}
	private static boolean isPalindrome(int i) {
		int temp = i,sum = 0;
		while(temp > 0){
			sum = sum * 10 + (temp % 10);
			temp = temp / 10;
		}
		return sum == i;
	}
	public static void main(String[] args) {
		int num = 105;
		System.out.println("Closest Palindrome of " + num + " -> " + closestPalindrome(num));
	}
}
