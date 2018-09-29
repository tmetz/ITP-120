/*
 * Letter Counter Lab (chapter 4, programming challenge #5)
 * 
 * Author: Tamara Metz
 * Date: 9-29-18
 * 
 * The purpose is this lab is to:
 * Take input of a string and a character, and count the number of times the
 * character appears in the string
 * 
 */

package letterCounter;

import java.util.Scanner;

public class LetterCounter {

	public static void main(String[] args) {
		int charCount = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your string: ");
		String userString = input.next(); 
		
		System.out.println("Please enter character to look for: ");
		//The book didn't say to make it case sensitive, so making everything lowercase 
		char userChar = input.next().toLowerCase().charAt(0);
		
		for (int i = 0; i < userString.length(); i++) {
			if (userChar == userString.toLowerCase().charAt(i)) {
				charCount++;
			}
		}
		
		System.out.printf("The character %s appears in the word %s %d times.",userChar, userString, charCount);
		input.close();
	}

}
