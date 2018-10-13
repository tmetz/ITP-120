/*
 * Array Lab 1
 * 
 * Author: Tamara Metz
 * Date: 10-13-18
 * 
 * The purpose is this lab is to:
 * 
 * Create arrays of ints, doubles, and Strings
 * Display the values of the arrays
 * Change an array element and re-display the values
 */


package arrayLab;

public class ArrayLab {
	
	public static void printInt(int[] passedArray) {
		for (int i = 0; i < passedArray.length; i++) {
			System.out.println(passedArray[i]);
		}
		System.out.println();
	}
	
	public static void printDouble(double[] passedArray) {
		for (int i = 0; i < passedArray.length; i++) {
			System.out.println(passedArray[i]);
		}
		System.out.println();
	}
	
	public static void printString(String[] passedArray) {
		for (int i = 0; i < passedArray.length; i++) {
			System.out.println(passedArray[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = -3;
		intArray[2] = 78; 
		intArray[3] = 23;
		intArray[4] = -1005;
		printInt(intArray);
		
		double[] doubleArray = {4.5, 9.99, 1.0, -3.4};
		printDouble(doubleArray);
		
		String[] strArray = {"one", "two", "three", "four", "five"};
		printString(strArray);
		strArray[3] = "ruof";
		printString(strArray);
	}

}
