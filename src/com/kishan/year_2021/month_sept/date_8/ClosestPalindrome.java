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

	//optimized approach
	static String closestPalindrome(String num){
		if(Integer.parseInt(num) < 10){
			return String.valueOf(Integer.parseInt(num)-1);
		}
		if(checkAll9(num)){
			return String.valueOf(Integer.parseInt(num)+2);
		}
		int length = num.length();
		String firstHalf = num.substring(0, length /2);
		String middle = "";
		if(length % 2 == 1){
			middle = Character.toString(num.charAt(length/2));
		}
		String secondHalf = reverse(firstHalf);

		String pal1 = "",pal2 = "", pal3 = "";

		if(length % 2 == 1){
			pal1 = firstHalf + middle + secondHalf;
			if(middle.equals("0")){
				String temp = addCarry(firstHalf,-1);
				pal2 = temp + "9" + reverse(temp);
			}else{
				pal2 = firstHalf + (Integer.parseInt(middle) - 1) + secondHalf;
			}
			if(middle.equals("9")){
				String temp = addCarry(firstHalf,1);
				pal3 = temp + "0" + reverse(temp);
			}else{
				pal3 = firstHalf + (Integer.parseInt(middle) + 1) + secondHalf;
			}
		}
		else{
			pal1 = firstHalf + secondHalf;
			String temp = "";
			int firstHalfLength = firstHalf.length();
			int lastNumber = Math.abs(Character.getNumericValue(firstHalf.charAt(firstHalfLength - 1) - 1));
			if(firstHalf.charAt(firstHalfLength -1) == '0'){
				temp = addCarry(firstHalf,-1);
			}
			else{
				temp = firstHalf.substring(0, firstHalfLength -1) + lastNumber;
			}
			pal2 = temp + reverse(temp);

			if(firstHalf.charAt(firstHalfLength -1) == '9'){
				temp = addCarry(firstHalf,1);
			}
			else{
				temp = firstHalf.substring(0, firstHalfLength -1) + lastNumber;
			}
			pal3 = temp + reverse(temp);
		}

		int diff1 = Math.abs(Integer.parseInt(num) - Integer.parseInt(pal1.trim()));
		int diff2 = Math.abs(Integer.parseInt(num) - Integer.parseInt(pal2.trim()));
		int diff3 = Math.abs(Integer.parseInt(num) - Integer.parseInt(pal3.trim()));

		if(Integer.parseInt(num) == Integer.parseInt(pal1)){
			return String.valueOf(diff2 <= diff3 ? Integer.parseInt(pal2) : Integer.parseInt(pal3));
		}
		else if(Integer.parseInt(num) > Integer.parseInt(pal1)){
			return String.valueOf(diff1 <= diff3 ? Integer.parseInt(pal1) : Integer.parseInt(pal3));
		}
		else{
			return String.valueOf(diff2 <= diff1 ? Integer.parseInt(pal2) : Integer.parseInt(pal1));
		}
	}

	static String reverse(String num){
		return new StringBuilder(num).reverse().toString();
	}

	static String addCarry(String num,int carry){
		char[] chars = num.toCharArray();
		if(carry == -1){
			int length = chars.length-1;
			while(length >= 0 && chars[length] == '0'){
				chars[length--] = '9';
			}

			if(length >= 0){
				chars[length] = Character.forDigit((Character.getNumericValue(chars[length]) - 1),10);
			}
		}
		else{
			for(int i = chars.length-1; i >= 0; i--) {
				int value = Character.getNumericValue(chars[i]);
				chars[i] = Character.forDigit(((value + carry) % 10),10);
				carry = (value + carry) / 10;
			}
		}
		return String.valueOf(chars);
	}

	private static boolean checkAll9(String num) {
		for(int i = 0; i < num.length(); i++) {
			if(Character.getNumericValue(num.charAt(i)) != 9) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int num = 9990068;
		System.out.println("Closest Palindrome of " + num + " -> " + closestPalindrome(num));
		System.out.println("Closest Palindrome of " + num + " -> " + closestPalindrome(""+num));
	}
}
