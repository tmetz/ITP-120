/*
 * Array Lab 3
 * 
 * Author: Tamara Metz
 * Date: 11-3-18
 * 
 * The purpose is this lab is to:
 * 
 * Use method overloading to perform a linear search on both
 * an array of doubles (part A) and an array of Strings (part B).
 * 
 */

package arrayLab3;

public class ArrayLab3 {

	// Part A:
	public static int linearSearch(double[] ar, double key) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void printArray(double[] ar) {
		System.out.print("[");
		for (int j = 0; j < ar.length - 1; j++) {
			System.out.print(ar[j] + ", ");
		}
		System.out.println(ar[ar.length - 1] + "]");
	}
	
	//Part B:
	public static int linearSearch(String[] ar, String key) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void printArray(String[] ar) {
		System.out.print("[");
		for (int j = 0; j < ar.length - 1; j++) {
			System.out.print(ar[j] + ", ");
		}
		System.out.println(ar[ar.length - 1] + "]");
	}
	
	public static void main(String[] args) {
		double[] doublesArray = {5.6, -9.23, 3.14, 5.0};
		String[] stringsArray = {"Tammy", "Rachel", "Marianne", "Shmuel", "Bob"};
		
		System.out.print("Part A array: ");
		printArray(doublesArray);
		int arrPos = linearSearch(doublesArray, 3.14);  // should return 2
		System.out.println("Postition of 3.14: " + arrPos);
		arrPos = linearSearch(doublesArray, 100.1); // should return -1
		System.out.println("Postition of 100.1: " + arrPos);

		System.out.print("\nPart B array: ");
		printArray(stringsArray);
		arrPos = linearSearch(stringsArray, "Bob");
		System.out.println("Postition of \"Bob\": " + arrPos);
		arrPos = linearSearch(stringsArray, "Judy");
		System.out.println("Postition of \"Judy\": " + arrPos);
	}
	
	

}
