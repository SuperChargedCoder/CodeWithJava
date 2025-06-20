package com.Java;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*Write a program to remove duplicate characters in a given String.*/
public class RemoveDuplicateChar {
	
	static String inputText;
	
	static {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Text : ");
		inputText = scan.next().toLowerCase();
	}
	
	public static void main(String[] args) {
		RemoveDuplicateCharacter(inputText);
	}
	
	public static void RemoveDuplicateCharacter (String input) {
		char[] characters = input.toCharArray();
		LinkedHashSet<Character> uniqueChar = new LinkedHashSet<>();
		for (char c : characters) {
			if (!uniqueChar.contains(c)) {
				uniqueChar.add(c);
			}
		}
		StringBuilder resultBuilder = new StringBuilder();

        for (char character : uniqueChar) {
            resultBuilder.append(character);
        }

        System.out.println(resultBuilder.toString());
	}

}
