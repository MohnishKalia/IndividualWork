package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;
	public Parallelogram() {
		super();
		height = Math.random();
	}

	public Parallelogram(double leftright, double topbottom, double xHeight) {
		super(leftright, topbottom, leftright, topbottom);
		height = xHeight;
	}

	public double area() {
		return super.getS2() * height;
	}

	public String toString() {
		return "Parallelogram: height = " + height + super.toString();
	}

	public boolean equals(Object other) {
		return this.toString().equals(other.toString());
	}

	public Object clone() {
		return new Parallelogram(super.getS1(), super.getS2(), height);
	}
}
