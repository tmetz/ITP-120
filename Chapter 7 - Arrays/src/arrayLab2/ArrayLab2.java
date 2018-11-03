/*
 * Array Lab 2
 * 
 * Author: Tamara Metz
 * Date: 10-27-18
 * 
 * The purpose is this lab is to:
 * 
 * Create an int array, pass it to a method called
 * changeInp, then return an array that has 3 added
 * to each element of the original array.
 */

package arrayLab2;

public class ArrayLab2 {
	
	public static int[] changeInp(int[] a) {
		int[] localArray = new int[4];
		for (int i = 0; i < a.length; i++) {
			localArray[i] = a[i] + 3;
		}
		return localArray;
	}

	public static void main(String[] args) {
		int[] arrayToPass = {44, 5, 33, 12};
		int[] arrayToReceive = changeInp(arrayToPass);
		System.out.println("The values of the array are: ");
		for (int j = 0; j < arrayToReceive.length; j++) {
			System.out.println(arrayToReceive[j]);
		}
	}

}
