package recursion;

public class RecNumber {
	private int sum = 0;
	private int sumO = 0;

	public RecNumber() {
	}

	public int sumTheNumbers(int num) {
		if (num > 0) {
			sum += num;
			sumTheNumbers(num - 1);
		}
		return sum;
	}

	public int sumTheOdds(int oddNum) {
		if (oddNum > 0 && oddNum % 2 == 1) {
			sumO += oddNum;
			sumTheOdds(oddNum - 2);
		}
		return sumO;
	}

	public int reverseOrder(int num) {
		return 4;
	}

	public String twoNumberSum(int num1, int num2) {
		return "fun";
	}

	public int productOfDigits(int num) {
		return 3;
	}

	public int numOfZeros(int num) {
		return 6;
	}

	public int fibonacci(int index) {
		return 4;
	}
}
