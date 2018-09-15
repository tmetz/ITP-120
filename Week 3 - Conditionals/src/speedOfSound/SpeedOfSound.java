/*
 * Speed of Sound Lab (chapter 3, programming challenge #12)
 * 
 * Author: Tamara Metz
 * Date: 9-15-18
 * 
 * The purpose is this lab is to:
 * 
 * Ask the user to enter the distance a sound wave will travel
 * and a medium it will travel through (air, water, or steel).
 * Then calculate the amount of time it will take using the formula
 * Time = Distance / Speed.
 * 
 * 
 */

package speedOfSound;

import java.util.Scanner;

public class SpeedOfSound {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How far will your sound wave travel (in feet)? ");
		double distance = input.nextDouble();
		System.out.println("Through what medium will your sound wave travel (air, water, or steel)? ");
		input.nextLine(); // flush the extra line
		String travelMedium = input.nextLine().toLowerCase();
		
		switch(travelMedium) {
		case "air":
			System.out.printf("Your sound wave will take %.2f seconds to reach its destination.", distance/1100);
			break;
		case "water":
			System.out.printf("Your sound wave will take %.2f seconds to reach its destination.", distance/4900);
			break;
		case "steel":
			System.out.printf("Your sound wave will take %.2f seconds to reach its destination.", distance/16400);
			break;
		default:
			System.out.println("I'm sorry, that is not a valid medium.");
		}
		input.close();
	}

}
