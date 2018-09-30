package mathOperators;
import java.util.Scanner;
public class TestAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test1 = -99;
		int test2 = -99;
		int test3 = -99;
		int testAvg = -99;
		System.out.println("What is the first test score?");
		test1 = input.nextInt();
		System.out.println("What is the second test score?");
		test2 = input.nextInt();
		System.out.println("What is the third test score?");
		test3 = input.nextInt();
		testAvg = (test1+test2+test3)/3;
		System.out.println("First Test Score: " + test1);
		System.out.println("Second Test Score: " + test2);
		System.out.println("Third Test Score: " + test3);
		System.out.println("The average test score was " + testAvg);
		input.close();
	}

}
