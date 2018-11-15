package loops;

public class MostDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 1000;
		int largest = 0;
		int largestNum = 0;
		for (int arbitrary; num > 0; num--) {
			for (int j = num; j <= num && j > 0; j--) {
				if (num % j == 0) {
					count++;
				}
				if (count > largest) {
					largestNum = num;
					largest = count;
				}
			}
			count = 0;
		}
		System.out.println("There are " + largest + " divisors for this integer " + largestNum);

	}

}
