package recursion;
import java.util.Scanner;
public class TestRecNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		RecNumber math = new RecNumber();
		System.out.println("Sum the Numbers:");
		System.out.println(math.sumTheNumbers(3));
		System.out.println("Sum the Odd Numbers:");
		System.out.println(math.sumTheOdds(15));
		System.out.println("Fibonacci:");
		System.out.println(math.fibonacci(7));
		System.out.println("Product of Digits:");
		System.out.println(math.productOfDigits(344));
		System.out.println("Reverse Order:");
		System.out.println(math.reverseOrder(123456));
		input.close();
	}

}
