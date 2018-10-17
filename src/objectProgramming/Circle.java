package objectProgramming;

public class Circle {
	private double radius;

	public Circle() {
		radius = -99.4;
	}

	public void setRadius(double xRadius) {
		radius = xRadius;
	}

	public double returnRadius() {
		return radius;
	}

	public double circumference() {
		double circumference = 2 * radius * Math.PI;
		return circumference;
	}

	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public void changeRadius(double change) {
		radius = change * radius;
	}
}
