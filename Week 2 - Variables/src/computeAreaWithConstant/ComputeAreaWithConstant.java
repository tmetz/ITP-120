package computeAreaWithConstant;

import java.util.Scanner;

public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		final double PI = 3.14159; // declare a constant
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * PI;
		
		System.out.println("Area: " + area);
		
		input.close();

	}

}
