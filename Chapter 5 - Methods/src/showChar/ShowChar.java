/*
 * showChar Lab (chapter 5, programming challenge #1)
 * 
 * Author: Tamara Metz
 * Date: 10-6-18
 * 
 * The purpose is this lab is to:
 * Define a method named showChar that takes a string
 * and an integer as input, then outputs the character
 * that is located at that integer's position.
 * 
 */

package showChar;

public class ShowChar {

	public static void showChar(String inputText, int position) {
		System.out.printf("Your string is \"%s\"\n", inputText);
		System.out.printf("The character at position %d is: ", position);
		System.out.println(inputText.charAt(position));
	}
	public static void main(String[] args) {
		showChar("California", 7);
	}

}
