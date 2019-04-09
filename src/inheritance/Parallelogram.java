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
}
