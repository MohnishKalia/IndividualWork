package recursion;

public class RecNumber {

	public RecNumber() {
	}

	public int sumTheNumbers(int num) {
		if (num > 0) {
			return num + sumTheNumbers(num - 1);
		}
		return 0;
	}

	public int sumTheOdds(int oddNum) {
		if (oddNum > 0 && oddNum % 2 == 1) {
			return oddNum + sumTheOdds(oddNum - 2);
		}
		return 0;
	}

	public int reverseOrder(int num) {
		// 123456 into 654321
		// Each time take end result and multiply the current result by 10
		if (num > 0) {

		}
		return 0;
	}

	public int twoNumberSum(int num1, int num2) {
		return 4;
	}

	public int productOfDigits(int num) {
		if (num > 0) {
			return num % 10 * productOfDigits(num / 10);
		}
		return 1;
	}

	public int numOfZeros(int num) {
		return 7;
	}

	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public void printHello(int howMany) {
		if (howMany > 1) {
			printHello(howMany - 1);
		}
		System.out.println("Hello");
	}
}
