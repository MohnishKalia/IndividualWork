package objectProgramming;

public class Numbers {
	public Numbers() {

	}

	public void sayNumber(int num) {
		System.out.println(num);
	}

	public void sayNumberPlus2(int num) {
		int result = num + 2;
		System.out.println(result);
	}

	public void saySum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	public double returnSquare(double num1) {
		double result = Math.pow(num1, 2);
		System.out.println(result);
		return result;
	}

	public double returnArea(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
		return result;
	}

	public int returnRoundUp(double num1) {
		int result = (int) Math.ceil(num1);
		System.out.println(result);
		return result;
	}
}
