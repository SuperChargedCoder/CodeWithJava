package com.Java;

import java.util.Scanner;

/*Check for Palindrome String*/
public class PalindromeString extends ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Text : ");
		System.out.print(PalindromCheck(scan.next()));
	}
	
	public static boolean PalindromCheck (String input) {
		String reversedString = reverse(input);
		if (reversedString.equals(input)) {
			return true;
		}
		return false;
	}
}
