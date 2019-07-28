package com.vijay.string;

import java.util.Arrays;

public class StringEx2 {

	public void reverseOfString() {
		String string = "Dream big";
		// Stores the reverse of given string
		String reversedStr = "";

		// Iterate through the string from last and add each character to variable
		// reversedStr
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + string.charAt(i);
		}

		System.out.println("Original string: " + string);
		// Displays the reverse of given string
		System.out.println("Reverse of given string: " + reversedStr);
	}

	public void findDuplicateCharactersInString() {

		String string1 = "Great responsibility";
		int count;

		// Converts given string into character array
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i] + "----" + count);
		}

		System.out.println("The final string array is::" + Arrays.toString(string));

	}

	
	public void isPolindrome()
	{
		String str=new String("kayak");
		
		char[] array1=str.toCharArray();
		char[] reverseArray=new char[array1.length];
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		StringEx2 ex2 = new StringEx2();
		ex2.reverseOfString();
		ex2.findDuplicateCharactersInString();
	}

}
