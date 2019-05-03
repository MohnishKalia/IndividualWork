package designingClasses;

public class Employee {
	private String name;
	private double rate;
	private double[] work = new double[52];
	private static int employeeClassNumber = 0;
	private int employeeNumber;

	public Employee() {
		name = "John Smith";
		rate = 10;
		for (int i = 0; i < work.length; i++) {
			work[i] = Math.random() * 40;
		}
		employeeClassNumber++;
		employeeNumber = employeeClassNumber;
	}

	public void modifyRate(double xChange) {
		if (xChange > 0)
			rate += xChange;
	}

	public double calcPay(int weekNum) {
		if (weekNum > 0 && weekNum <= work.length)
			return work[weekNum - 1] * rate;
		else
			return -14906.23;
	}

}

