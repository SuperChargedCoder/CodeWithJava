package com.Java;

/*What is difference between == and .equals() in java for comparing objects*/

public class EqualityDemo {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("String Comparison:");
        /*Reference Comparison : Compares memory addresses (i.e., checks if two references point to the same object in memory)*/
        System.out.println("Using ==      : " + (str1 == str2));         // false – different objects
        /*Content Comparison : Compares the actual content or value of two objects*/
        System.out.println("Using .equals(): " + str1.equals(str2));     // true  – same content
	}
}
