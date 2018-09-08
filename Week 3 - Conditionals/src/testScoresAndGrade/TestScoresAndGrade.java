/*
 * Test Scores and Grade Lab (chapter 3, programming challenge #4)
 * 
 * Author: Tamara Metz
 * Date: 9-8-18
 * 
 * The purpose is this lab is to:
 * Take input of three test scores from the user, calculate the average,
 * and display the letter grade
 * 
 * 
 */


package testScoresAndGrade;

import java.util.Scanner;

public class TestScoresAndGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first test score: ");
		double score1 = input.nextDouble();
		System.out.println("Please enter the second test score: ");
		double score2 = input.nextDouble();
		System.out.println("Please enter the third test score: ");
		double score3 = input.nextDouble();
		
		double average = (score1 + score2 + score3)/3;
		
		System.out.println("Your average is " + average);
		System.out.print("Your letter grade is: ");
		
		if (average >= 90 && average <= 100) {
			System.out.println("A");
		}
		else if (average >=80 && average <= 89) {
			System.out.println("B");
		}
		else if (average >= 70 && average <= 79) {
			System.out.println("C");
		}
		else if (average >= 60 && average <= 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
