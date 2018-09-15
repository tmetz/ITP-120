package seasons;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		String input;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the name of a season: ");
		input = keyboard.nextLine();
		
		switch(input) {
			case "spring":
				System.out.println("la primavera");
				break;
			case "summer":
				System.out.println("el verano");
				break;
			case "autumn":
			case "fall":
				System.out.println("el otono");
				break;
			case "winter":
				System.out.println("el invierno");
				break;
			default:
				System.out.println("That's not a correct season.");
		}
		keyboard.close();
	}

}
