/*
 * Password Strength Lab
 * 
 * Author: Tamara Metz
 * Date: 10-13-18
 * 
 * The purpose is this lab is to:
 * 
 * Check a user's password strength based on length, number of digits,
 * number of special characters, and number of uppercase letters.
 */


package passwordStrength;

import java.util.Scanner;

public class PasswordStrength {
	
	public static void promptForPass() {
		System.out.println("Please enter a password with: ");
		System.out.println("- At least 8 characters");
		System.out.println("- At least 1 uppercase letter");
		System.out.println("- At least 2 digits");
		System.out.println("- At least 1 special character (! _ or *)");
	}
	
	public static void outputPassEvaluation (int pLength, int pUp, int pDig, int pSpec) {
		if (pLength < 8) {
			System.out.println("ERROR: you need at least 8 characters");
		}
		if (pUp < 1) {
			System.out.println("ERROR: you need at least 1 uppercase letter");
		}
		if (pDig < 2) {
			System.out.println("ERROR: you need at least 2 digits");
		}
		if (pSpec < 1) {
			System.out.println("ERROR: you need at least 1 special character (! _ or *)");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		boolean validPass = false;
		Scanner input = new Scanner(System.in);
		String password = "";
		int numDigits = 0;
		int numUpper = 0;
		int numSpecial = 0;
		while (validPass == false) {
			promptForPass();
			password = input.next();
			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i))) {
					numUpper++;
				}
				if (Character.isDigit(password.charAt(i))) {
					numDigits++;
				}
				if (password.charAt(i) == '!' || password.charAt(i) == '_' || password.charAt(i) == '*') {
					numSpecial++;
				}
			}
			if (password.length() >= 8 && numDigits >=2 && numUpper >= 1 && numSpecial >= 1) {
				validPass = true;
			}
			else {
				outputPassEvaluation (password.length(), numUpper, numDigits, numSpecial);
				numDigits = numUpper = numSpecial = 0;
			}
		}
		System.out.println("Thank you, you have chosen an acceptable password.");
		input.close();
	}
}
