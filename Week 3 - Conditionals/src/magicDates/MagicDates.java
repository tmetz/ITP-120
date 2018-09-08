/*
 * Magic Dates Lab (chapter 3, programming challenge #2)
 * 
 * Author: Tamara Metz
 * Date: 9-8-18
 * 
 * The purpose is this lab is to:
 * Take input of a day, month, and year and determine whether
 * this comprises a "magic" date (month times day = year).
 * It then displays a message telling the user whether or not
 * it is a magic date.
 * 
 * 
 */


package magicDates;

import java.util.Scanner;

public class MagicDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the month as a number (e.g. \"6\" for June): ");
		int month = input.nextInt();
		System.out.println("Please enter the day of the month: ");
		int day = input.nextInt();
		System.out.println("Please enter the 2-digit year (e.g. \"60\" for 1960): ");
		int year = input.nextInt();
		System.out.println("\n");
		
		System.out.print("The date " + month + "/" + day + "/" + year + " ");
		if (month * day == year) {
			System.out.println("is a magic date!");
		}
		else {
			System.out.println("is not a magic date.");
		}
		
		input.close();

	}

}
