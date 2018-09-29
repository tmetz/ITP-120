package timesTwo;

import java.util.Scanner;

public class TimesTwo {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int userNumber = input.nextInt();
		int answer = times2(userNumber);
		System.out.println("Answer: " + answer);
		input.close();

	}
	
	public static int times2(int x) {
		return 2*x;
	}
}
