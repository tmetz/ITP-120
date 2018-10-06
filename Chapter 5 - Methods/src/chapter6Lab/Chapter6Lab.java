/*
 * Method Lab ("doSomething")
 * 
 * Author: Tamara Metz
 * Date: 10-6-18
 * 
 * The purpose is this lab is to:
 * Define a method "doSomething()" that will accept
 * arguments passed to it and write them to the console
 * 
 * (NOTE: The lab assignment says this is chapter 6, but 
 * that may be from a different book -- we are learning 
 * methods in chapter 5)
 * 
 */

package chapter6Lab;

public class Chapter6Lab {

	static void doSomething(String myText, int numTimes) {
		for (int i = 0; i < numTimes; i++) {
			System.out.println(myText);
		}
		
	}
	
	
	public static void main(String[] args) {
		String myOutput = "This is getting passed to the method!";
		int loopTimes = 7;
		doSomething(myOutput, loopTimes);

	}

}
