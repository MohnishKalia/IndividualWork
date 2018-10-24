package objectProgramming;

import java.util.Scanner;
public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone bob = new Phone();
		Scanner input = new Scanner(System.in);

		System.out.println("What 1) was the phone number called and 2) how long was the call in minutes?");
		long xSent = input.nextLong();
		long xMinChange = input.nextLong();
		bob.makeACall(xSent, xMinChange);

		System.out
				.println("You have done " + bob.getCalls() + " call(s), and have used " + bob.getMinutes()
						+ " minute(s)");

		System.out.println("What 1) was the phone number called and 2) how long was the call in minutes?");
		long xSent2 = input.nextLong();
		long xMinChange2 = input.nextLong();
		bob.makeACall(xSent2, xMinChange2);

		System.out.println(
				"You have done " + bob.getCalls() + " call(s), and have used " + bob.getMinutes() + " minute(s)");

		input.close();
	}

}
