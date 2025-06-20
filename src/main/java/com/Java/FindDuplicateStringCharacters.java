package com.Java;

import java.util.HashSet;
import java.util.Scanner;

/*Write a program to find duplicate characters in a given String*/
public class FindDuplicateStringCharacters {

	static String inputText;
	static char[] character;
	static {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		inputText = scan.nextLine().toLowerCase();
		character = inputText.toCharArray();
	}

	public static void main(String[] args) {
		HashSet<Character> duplicateChar = new HashSet<>();
		boolean noDuplicateFound = true;
		System.out.print("Duplicate characters : ");
		for (int i = 0; i < character.length; i++) {
			for (int j = i + 1; j < character.length; j++) {
				if (character[i] == character[j]) {
					duplicateChar.add(character[i]);
					noDuplicateFound = false;
					break;
				}
			}
		}
		System.out.println(duplicateChar);

		if (noDuplicateFound) {
			System.out.println("No duplicates found.");
		}
	
	}
}
