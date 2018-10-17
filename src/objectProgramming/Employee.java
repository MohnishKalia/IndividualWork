package objectProgramming;

public class Employee {
	private double wage;
	private int exp;

	public Employee() {
		wage = 7.25;
		exp = 1;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double xWage) {
		wage = xWage;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int xExp) {
		exp = xExp;
	}

	public void raiseWage() {
		wage = 1.1 * wage;
	}
}
