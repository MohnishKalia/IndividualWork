package objectProgramming;

public class RightTriangle {
	private double base;
	private double height;

	public RightTriangle() {

	}

	public RightTriangle(double xBase, double xHeight) {
		base = xBase;
		height = xHeight;
	}

	public double hypot() {
		return Math.hypot(base, height);
	}

	public double perimeter() {
		return base + height + Math.hypot(base, height);
	}

	public double area() {
		return 0.5 * base * height;
	}
}
