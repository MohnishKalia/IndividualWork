package interfaces;

public class Trout implements Fish {
	private double length;
	private int age;
	private double numScales;

	public Trout() {
		length = 8.67;
		age = 3;
		numScales = 20 * Math.random();
	}

	public Trout(double xLength, int xAge, double xNumScales) {
		length = xLength;
		age = xAge;
		numScales = xNumScales;
	}

	public double getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	public double getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public double getScales() {
		return numScales;
	}

	public String toString() {
		return "Length: " + length + ", Age: " + age + ", #ofScales: " + numScales;
	}

}
