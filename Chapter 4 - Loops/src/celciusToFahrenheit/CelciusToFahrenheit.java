/*
 * Celcius to Fahrenheit (chapter 4, programming challenge #11)
 * 
 * Author: Tamara Metz
 * Date: 9-29-18
 * 
 * The purpose is this lab is to:
 * Display a table of Celcius values 0 through 20 and their
 * Fahrenheit equivalents
 * 
 */

package celciusToFahrenheit;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		System.out.println("Celsius       Fahrenheit");
		System.out.println("------------------------");
		for (int c = 0; c < 21; c++) {
			System.out.printf("%5d %15.2f\n", c, (9.0/5)*(double)c + 32);
		}

	}

}
