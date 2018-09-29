/*
 * While loop lab (problem 5.1 from other textbook)
 * 
 * Author: Tamara Metz
 * Date: 9-22-18
 * 
 * The purpose is this lab is to:
 * 
 * Read an unspecified number of integers from the user, determine
 * how many positive and negative integers have been entered, and
 * computes the total and average of the numbers that were input.
 * 
 * Uses a while loop with a sentinel that, when set to 0, will end
 * the loop.  Several variables are incremented each loop to keep
 * track of the totals.
 * 
 */


package countingIntegers;

import java.util.Scanner;

public class CountingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput = 1;
		int posCount = 0;
		int negCount = 0;
		int sum = 0;
		int totalCount = 0;
		while (userInput != 0) {
			System.out.println("Enter an integer, the input ends if it is 0: ");
			userInput = input.nextInt();
			if (userInput < 0) {
				negCount++;
				sum += userInput;
				totalCount ++;
			}
			else if (userInput > 0) {
				posCount++;
				sum += userInput;
				totalCount ++;
			}
		}
		if (totalCount > 0) {
			System.out.println("The number of positives is " + posCount);
			System.out.println("The number of negatives is " + negCount);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + (double)sum/totalCount);
		}
		else {
			System.out.println("No numbers are entered except 0");
		}

	}

}
