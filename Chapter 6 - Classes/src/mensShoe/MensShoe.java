/*
 * Men's Shoes class lab
 * 
 * Author: Tamara Metz
 * Date: 12-1-18
 * 
 * The purpose is this lab is to:
 * 
 * Create a class for mend's shoes that has two constructors and variables for
 * size, color, and style. Also create a toString() method to write the shoe
 * characteristics into a string.  Finally, create two shoe pair objects, and 
 * display their characteristics.
 * 
 */

package mensShoe;

public class MensShoe {
	
	private double size;
	private String color;
	private String style;
	
	public MensShoe() {
		size = 5.0;
		color = "black";
		style = "sneaker";
	}
	
	public MensShoe(double sz, String clr, String sty) {
		if (sz > 0) {
			size = sz;
		}
		color = clr;
		style = sty;
	}
	
	public String toString() {
		String infoString = "size " + size + " " + color + " " + style + ".";
		return infoString;
	}
	public static void main(String[] args) {
		MensShoe pair1 = new MensShoe(9.5, "brown", "loafers");
		MensShoe pair2 = new MensShoe(10, "yellow", "sneakers");
		System.out.print("First pair of shoes is a pair of ");
		System.out.println(pair1.toString() + "\n");
		System.out.print("Second pair of shoes is a pair of ");
		System.out.println(pair2.toString());

	}

}
