package loops;

import java.util.Scanner;
public class CountBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 5;
		System.out.println("What is your upper bound?");
		int uBound = input.nextInt();
		if (uBound < 0) {
			System.out.println("Invalid Bound: Default is 115");
			uBound = 115;
		}
		while (count <= uBound) {
			System.out.println(count);
			count += 5;
		}
		input.close();
	}

}
