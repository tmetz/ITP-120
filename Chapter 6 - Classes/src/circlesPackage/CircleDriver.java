/*
 * Circle class lab
 * 
 * Author: Tamara Metz
 * Date: 11-17-18
 * 
 * The purpose is this lab is to:
 * 
 * Create a Circle class that will have a class method getArea() to return
 * the area of a circle.  Then create a Circle object with a radius of 5.2 and display its area.
 */

package circlesPackage;

public class CircleDriver {

	public static void main(String[] args) {
		Circle circ1 = new Circle(5.2);
		System.out.println("The circle area is: " + circ1.getArea());
	}

}
