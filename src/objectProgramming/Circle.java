package objectProgramming;

public class Circle {
	private double radius;

	public Circle() {
		radius = 10;
	}

	public Circle(double xRadius) {
		if (xRadius > 0)
			radius = xRadius;
		else
			radius = 1;
	}

	public void setRadius(double xRadius) {
		if (xRadius > 0)
			radius = xRadius;
		else
			radius = 1;
	}

	public double returnRadius() {
		return radius;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}