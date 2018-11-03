/*
 * Magic 8 Ball Lab
 * 
 * Author: Tamara Metz
 * Date: 10-3-18
 * 
 * The purpose is this lab is to:
 * Create a magic 8 ball program that stores fortunes in an array
 * and uses a random number generator to choose which fortune to
 * display 
 * 
 */


package magic8Ball;

import java.util.Scanner;

public class Magic8Ball {

	public static void tellFortune(String[] fortArr) {
		int fortuneNo = (int)(Math.random()*12);
		System.out.println(fortArr[fortuneNo]);
	}
	public static void main(String[] args) {
		String[] fortunes = {"Yes",
							"No",
							"Maybe",
							"Response is hazy",
							"Keep dreaming",
							"We'll see",
							"Absolutely!",
							"Cannot tell yet",
							"Ask a different question",
							"Could be",
							"Perhaps",
							"That is not for you to know"};
		char anotherFortune = 'y';
		Scanner input = new Scanner(System.in);
		String userQuestion = "";
		while (anotherFortune == 'y') {
			System.out.println("What yes/no question do you have for the Great Magic 8 Ball?");
			userQuestion = input.nextLine();
			tellFortune(fortunes);
			System.out.println("Do you want to ask another question? y/n");
			anotherFortune = input.nextLine().toLowerCase().charAt(0);
		}
		System.out.println("Thanks for calling on the Great Magic 8 Ball.  Have a great day!");
		input.close();
	}

}
