package com.Java;

import java.util.Scanner;

public class DuplicateCharCountInString {
	
	static String inputText;
	static char targetChar;
	
	/*Using static block for Code Optimisation and Reusability*/
	static {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		inputText = scan.nextLine();
		System.out.print("Enter a character to count: ");
        targetChar = scan.next().charAt(0);
    }
	
	public static void main(String[] args) {
		StringToArray();
	}
	
	public static void BasicMethod () {
		int count = 0;
		for (int i = 0; i < inputText.length(); i++) {
			if(inputText.charAt(i)==targetChar) { // Case Sensitive comparison
				count++;
			}
		}
		System.out.println("\nCharacter '" + targetChar + "' appears " + count + " time(s) in the string.");
	}
	
	public static void StringToArray () {
        int count = 0;
        for (char ch : inputText.toCharArray()) {
            if (Character.toLowerCase(ch) == Character.toLowerCase(targetChar)) { // Case-insensitive comparison
                count++;
            }
        }
        System.out.println("\nCharacter '" + targetChar + "' appears " + count + " time(s) in the string.");
	}
}
