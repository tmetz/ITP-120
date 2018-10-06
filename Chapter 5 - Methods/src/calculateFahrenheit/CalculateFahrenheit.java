/*
 * Methods Calculate Fahrenheit Lab
 * 
 * Author: Tamara Metz
 * Date: 10-6-18
 * 
 * The purpose is this lab is to:
 * Accept user input of a temperature in celsius,
 * call the celsiusToFahrenheit method, and print
 * the return value (temperature in Fahrenheit) to the user.
 * 
 */

package calculateFahrenheit;

import java.util.Scanner;

public class CalculateFahrenheit {
	
	public static double celsiusToFahrenheit(double c) {
		// Value of c should be between -273 and 1000
		double fahrenheit = (9.0/5.0)*c + 32;
		return fahrenheit;
	}

	public static void main(String[] args) {
		System.out.println("Please enter a celsius temperature: ");
		Scanner input = new Scanner(System.in);
		double celsius = input.nextDouble();
		if (celsius > -273 && celsius < 1000) {
			double fahrenheit = celsiusToFahrenheit(celsius);
			System.out.printf("The value of %.1f in Celsius is %.1f in Fahrenheit", celsius, fahrenheit);
		}
		else {
			System.out.println("Sorry, the temperature needs to be between -273 and 1000 celsius.");
			System.out.println("I am not able to convert your temperature.");
		}
		input.close();
	}

}
