package inheritance;

public class Rectangle extends Quadrilateral {

	public Rectangle() {
		super();
	}

	public Rectangle(double l, double w) {
//		s1 = s3 = w;
//		s2 = s4 = l;
		super(w, l, w, l);
	}

	public double area() {
		return super.getS1() * super.getS2();
	}
}
