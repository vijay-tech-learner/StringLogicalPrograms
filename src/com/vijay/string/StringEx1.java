package com.vijay.string;

import java.util.Arrays;

public class StringEx1 {

	public void countVowelsAndConsonants() {

		// Counter variable to store the count of vowels and consonant
		int vCount = 0, cCount = 0;

		// Declare a string
		String str = "This is a really simple sentence";

		// Converting entire string to lower case to reduce the comparisons
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			// Checks whether a character is a vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				// Increments the vowel counter
				vCount++;
			}
			// Checks whether a character is a consonant
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				// Increments the consonant counter
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

	public void isAnagram() {
		String str1 = "Brag";
		String str2 = "Grab";

		// Converting both the string to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Checking for the length of strings
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the arrays to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			// Sorting the arrays using in-built function sort ()
			Arrays.sort(string1);
			Arrays.sort(string2);

			// Comparing both the arrays using in-built function equals ()
			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	}

	public void divideIntoEqualParts() {
		String str = "aaaabbbbcccc";

		// Stores the length of the string
		int len = str.length();
		// n determines the variable that divide the string in 'n' equal parts
		int n = 3;
		int temp = 0, chars = len / n;
		// Stores the array of string
		String[] equalStr = new String[n];
		// Check whether a string can be divided into n equal parts
		if (len % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				// Dividing string in n equal part using substring()
				String part = str.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}

	public void convertUppertoLowerViceVersa() {
		String str1 = "Great Power";
		StringBuffer newStr = new StringBuffer(str1);

		for (int i = 0; i < str1.length(); i++) {

			// Checks for lower case character
			if (Character.isLowerCase(str1.charAt(i))) {
				// Convert it into upper case using toUpperCase() function
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}
			// Checks for upper case character
			else if (Character.isUpperCase(str1.charAt(i))) {
				// Convert it into upper case using toLowerCase() function
				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + newStr);
	}

	public void replaceSpacesInString() {
		String string = "Once in a blue moon";
		char ch = '-';

		// Replace space with specific character ch
		string = string.replace(' ', ch);

		System.out.println("String after replacing spaces with given character: ");
		System.out.println(string);

	}

	public void countCharactersInString() {
		String string = "The best of both worlds";
		int count = 0;

		// Counts each character except space
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		// Displays the total number of characters present in the given string
		System.out.println("Total number of characters in a string: " + count);
	}

	public void countWords() {
		String sentence = "Beauty lies in the eyes of beholder";
		int wordCount = 0;

		for (int i = 0; i < sentence.length() - 1; i++) {
			// Counts all the spaces present in the string
			// It doesn't include the first space as it won't be considered as a word
			if (sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i + 1)) && (i > 0)) {
				wordCount++;
			}
		}
		// To count the last word present in the string, increment wordCount by 1
		wordCount++;

		// Displays the total number of words present in the given string
		System.out.println("Total number of words in the given string: " + wordCount);
	}

	public static void main(String[] args) {
		StringEx1 ex1 = new StringEx1();
		ex1.countVowelsAndConsonants();
		ex1.isAnagram();
		ex1.divideIntoEqualParts();

	}

}
