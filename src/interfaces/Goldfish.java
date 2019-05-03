package interfaces;

public class Goldfish implements Fish {
	private double length;
	private int age;
	private String color;

	public Goldfish() {
		length = 8.67;
		age = 3;
		color = "gold";
	}

	public Goldfish(double xLength, int xAge, String xColor) {
		length = xLength;
		age = xAge;
		color = xColor;
	}

	public double getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "Length: " + length + ", Age: " + age + ", Color: " + color;
	}

}
