package circlesPackage;

public class Circle {
	private double radius;
	
	// class constructor with no arguments
	public Circle() {
		radius = 1.0;
	}
	
	//class constructor with 1 argument
	public Circle(double r) {
		radius = r;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
