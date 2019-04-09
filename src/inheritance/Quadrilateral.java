package inheritance;

/**
 * <h4>A Quadrilateral has 4 sides</h4> This is a test for class descriptions.
 * @author 20kaliam
 */

public class Quadrilateral {
	private double s1, s2, s3, s4;

	public Quadrilateral() {
		s1 = Math.random();
		s2 = Math.random();
		s3 = Math.random();
		s4 = Math.random();
	}

	public Quadrilateral(double side1, double side2, double side3, double side4) {
		s1 = side1;
		s2 = side2;
		s3 = side3;
		s4 = side4;
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	public double getS4() {
		return s4;
	}

	public void setS4(double s4) {
		this.s4 = s4;
	}

	public double perimeter() {
		return s1 + s2 + s3 + s4;
	}
}
