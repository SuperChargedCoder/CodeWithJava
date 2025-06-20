package com.Java;

/*Write a program to reverse a given string*/

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(reverse("Water"));
	}
	
	public static String reverse(String input) {
		String reversed = "";
		for (int i = input.length()-1; i >= 0 ; i--) {
			reversed += input.charAt(i);
		}
		return reversed;
	}

}
