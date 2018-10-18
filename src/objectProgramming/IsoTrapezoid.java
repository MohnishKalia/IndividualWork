package objectProgramming;

public class IsoTrapezoid {
	private double base1;
	private double base2;
	private double height;
	private double leg;
	public IsoTrapezoid() {

	}

	public IsoTrapezoid(double xBase1, double xBase2, double xHeight, double xLeg) {
		base1 = xBase1;
		base2 = xBase2;
		height = xHeight;
		leg = xLeg;
	}

	public double perimeter() {
		return base1 + base2 + leg + leg;
	}

	public double area() {
		return ((base1 + base2) / 2) * height;
	}
}
