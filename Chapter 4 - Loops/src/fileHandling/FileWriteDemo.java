package fileHandling;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;



public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		String filename;
		String friendName;
		int numFriends;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many friends do you have? ");
		numFriends = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("Enter the filename: ");
		filename = keyboard.nextLine();
		
		PrintWriter outputFile = new PrintWriter(filename);
		
		for (int i = 0; i < numFriends; i++) {
			System.out.print("Enter the name of friend " + i + 1 + ": ");
			friendName = keyboard.nextLine();
			
			outputFile.print(friendName + " " + i + 1);
			outputFile.println();
		}
		
		outputFile.close();
		keyboard.close();
		System.out.println("Data written to file.");
	}

}
