package coinFlip;

import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		int flipValue = -1;
		
		System.out.println("Using Math.random and an int value: ");
		for (int i = 0; i < 100; i++) {
			flipValue = (int)(Math.random()*2);
			if (flipValue == 0) {
				System.out.println("Heads");
				heads++;
			}
			else {
				System.out.println("Tails");
				tails++;
			}
		}
		System.out.println("The number of heads was: " + heads);
		System.out.println("The number of tails was: " + tails);
		
		System.out.println("\n\nUsing Random nextBoolean: ");
		heads = 0;
		tails = 0;
		boolean flipValueBool;
		
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			flipValueBool = rnd.nextBoolean();
			if (flipValueBool == true) {
				System.out.println("Heads");
				heads++;
			}
			else {
				System.out.println("Tails");
				tails++;
			}
		}
		System.out.println("The number of heads was: " + heads);
		System.out.println("The number of tails was: " + tails);
	}

}
