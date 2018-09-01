/*
 * VariablesLab
 * 
 * Author: Tamara Metz
 * Date: 9-1-18
 * 
 * The purpose is this lab is to:
 * - Part A: declare, initialize, and display variables
 * - Part B: accept user input and set variables equal to those values using a Scanner object 
 * 
 */

package variablesLab;

import java.util.Scanner;

public class VariablesLab {

	public static void main(String[] args) {
		int daysUntilWinterBreak = 105;
		double pi = 3.1415; // more precise than float due to longer word length
		float accountBalance = 93.25f;
		char myInitial = 'T';
		boolean onWinterBreakYet = false;
		String myName = "Tammy Metz";
		
		System.out.println("There are " + daysUntilWinterBreak + " days left until winter break!");
		System.out.println("The approximate value of pi is " + pi);
		System.out.println("My account balance is currently $" + accountBalance);
		System.out.println("My first initial is " + myInitial);
		System.out.println("Are we on winter break yet?  Answer: " + onWinterBreakYet);
		System.out.println("My name is " + myName);
		
		System.out.println("\n\n\nNow it's your turn!");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many days until winter break? ");
		daysUntilWinterBreak = keyboard.nextInt();
		System.out.println("There are " + daysUntilWinterBreak + " days left until winter break!\n");
		
		System.out.print("What is pi? ");
		pi = keyboard.nextDouble();
		System.out.println("The approximate value of pi is " + pi + "\n");
		
		System.out.print("How much do I have in the bank? ");
		accountBalance = keyboard.nextFloat();
		System.out.println("My account balance is currently $" + accountBalance + "\n");
		
		System.out.print("What is my first initial? ");
		String initialString = "";
		initialString = keyboard.next();
		myInitial = initialString.charAt(0);
		System.out.println("My first initial is " + myInitial + "\n");
		
		System.out.print("True or False: we are on winter break right now? ");
		onWinterBreakYet = keyboard.nextBoolean();
		System.out.println("Are we on winter break yet?  Answer: " + onWinterBreakYet + "\n");
		
		
		keyboard.nextLine(); // flushes the extra line out of the buffer
		
	
		System.out.print("What is my name? ");
		myName = keyboard.nextLine();
		System.out.println("My name is " + myName);
		
		
		/*
		System.out.print("What is my name? ");
		myName = keyboard.next();
		System.out.println("My name is " + myName);
		*/
	}

}
