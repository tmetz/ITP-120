/*
 * Distance Traveled Lab (chapter 4, programming challenge #2)
 * 
 * Author: Tamara Metz
 * Date: 9-29-18
 * 
 * The purpose is this lab is to:
 * Take input of a speed and number of hours, and return a table
 * of distance traveled after each hour by using the formula d = rt
 * 
 */

package distanceTraveled;

import java.util.Scanner;

public class DistanceTraveled {

	public static void main(String[] args) {
		double speed = -1;
		int time = 0; // book wants a listing by individual hour, so using int
		
		Scanner input = new Scanner(System.in);
		while (speed < 0) {
			System.out.println("Please enter the speed of the vehicle (must not be negative): ");
			speed = input.nextDouble();
		}
		while (time < 1) {
			System.out.println("Please enter the number of hours (at least 1): ");
			time = input.nextInt();
		}
		
		System.out.format("%-15s  Distance Traveled\n", "Hour");
		System.out.format("----------------------------------\n");
		for (int i = 1; i < time + 1; i++) {
			System.out.format("%-15s  %.0f\n",i,speed*i); // The book example returns whole numbers for distance
		}
		input.close();
	}

}
