package passByValue;

import java.util.Scanner;

public class PassByValue {

	public static void swap(int a, int b) {
		System.out.printf("The value of a is %d.  The value of b is %d.\n\n", a, b);
		int temp_swap = a;
		a = b;
		b = temp_swap;
		System.out.printf("The value of a is %d.  The value of b is %d.", a, b);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first integer: ");
		int first_num = input.nextInt();
		System.out.println("Please enter the second integer: ");
		int second_num = input.nextInt();
		swap(first_num, second_num);
		input.close();

	}

}
