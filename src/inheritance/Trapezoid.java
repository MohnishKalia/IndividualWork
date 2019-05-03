package inheritance;

public class Trapezoid extends Quadrilateral {
	private double height;

	public Trapezoid() {
		super();
		height = Math.random();
	}

	/**
	 * Constructs Trapezoid |---------| | | | | |---------|
	 * 
	 * @param base1
	 * @param base2
	 * @param leg1
	 * @param leg2
	 * @param xHeight
	 */
	public Trapezoid(double base1, double base2, double leg1, double leg2, double xHeight) {
		super(leg1, base1, leg2, base2);
		height = xHeight;
	}

	public double area() {
		return (super.getS2() + super.getS4()) * height / 2;
	}
}
