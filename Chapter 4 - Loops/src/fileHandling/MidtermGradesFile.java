/*
 * Text I/O In Class Lab
 * 
 * Author: Tamara Metz
 * Date: 11-17-18
 * 
 * The purpose is this lab is to:
 * 
 * Check whether a user-entered filename exists as a file, then if not,
 * create the file and write out multiple lines of data to it in the format
 * FirstName MidtermGrade
 */

package fileHandling;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;



public class MidtermGradesFile {

	public static void main(String[] args) throws IOException {
		String filename;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the path and filename: ");
		filename = keyboard.nextLine();
		
		File file = new File(filename);
		if (file.exists()) {
			System.out.println("That file already exists.  Exiting program.");
			System.exit(1);
		}
		
		PrintWriter outputFile = new PrintWriter(filename);

		outputFile.println("Sue" + " " + 95.3);
		outputFile.println("Richard" + " " + 75.3);
		outputFile.close();
		keyboard.close();
		System.out.println("Data written to file.");
	}

}
