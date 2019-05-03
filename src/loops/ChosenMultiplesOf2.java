package loops;

import java.util.Scanner;
public class ChosenMultiplesOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("What is your upper bound?");
		int uBound = input.nextInt();
		if (uBound < 0) {
			uBound = 115;
			System.out.println("Invalid Answer: Default upper bound = 115");
		}
		while (count <= uBound) {
			System.out.println(count);
			count += 2;
		}
		input.close();
	}

}
