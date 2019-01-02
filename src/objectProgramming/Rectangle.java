package objectProgramming;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = 10;
		width = 10;
	}

	public Rectangle(double xLength, double xWidth) {
		if (xLength > 0 && xWidth > 0) {
			length = xLength;
			width = xWidth;
		}
	}

	public double returnLength() {
		return length;
	}

	public double returnWidth() {
		return width;
	}

	public void setLength(double xLength) {
		if (xLength > 0)
		length = xLength;
	}

	public void setWidth(double xWidth) {
		if (xWidth > 0)
		width = xWidth;
	}

	public double perimeter() {
		return 2 * length + 2 * width;
	}

	public double area() {
		return length * width;
	}

}
