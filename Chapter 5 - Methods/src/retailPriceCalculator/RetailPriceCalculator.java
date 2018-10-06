/*
 * Retail Price Calculator Lab (chapter 5, programming challenge #2)
 * 
 * Author: Tamara Metz
 * Date: 10-6-18
 * 
 * The purpose is this lab is to:
 * Take inputs of the wholesale price and markup percentage
 * and return the retail price
 * 
 */

package retailPriceCalculator;

import java.util.Scanner;

public class RetailPriceCalculator {
	
	public static double calculateRetail(double wholesale, double markup) {
		double additionalCost = wholesale * markup/100;
		double retail = wholesale + additionalCost;
		return retail;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the wholesale price of your item in dollars: ");
		double wholesale = input.nextDouble();
		System.out.println("Please enter the markup percentage: ");
		double markup = input.nextDouble();
		double retailPrice = calculateRetail(wholesale, markup);
		System.out.printf("The retail price is $%.2f.", retailPrice);
		input.close();
	}

}
