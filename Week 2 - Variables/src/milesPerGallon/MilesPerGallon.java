/*
 * Miles Per Gallon (chapter 2 Programming Challenge #9)
 * 
 * Author: Tamara Metz
 * Date: 9-1-18
 * 
 * The purpose is this lab is to ask the user to input the number of miles driven and how much gas was used,
 * and then output the miles per gallon.
 * 
 */


package milesPerGallon;

import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		double milesDriven;
		double gallonsGas;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of miles driven: ");
		milesDriven = input.nextDouble(); // if they enter an integer, it should still be converted to a double
		
		System.out.print("Enter the number of gallons of gas used: ");
		gallonsGas = input.nextDouble(); // if they enter an integer, it should still be converted to a double
		
		System.out.println("Your miles per gallon is " + milesDriven/gallonsGas + " MPG");
		
		input.close(); // close input stream

	}

}
