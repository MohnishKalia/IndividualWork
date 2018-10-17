package objectProgramming;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = -999.9;
		width = -999.9;
	}

	public double returnLength() {
		return length;
	}

	public double returnWidth() {
		return width;
	}

	public double perimeter() {
		double perimeter = 2 * length + 2 * width;
		return perimeter;
	}

	public double area() {
		double area = length * width;
		return area;
	}

	public void changeLength(double changeL) {
		length = changeL * length;
	}

	public void changeWidth(double changeW) {
		width = changeW * width;
	}
}
