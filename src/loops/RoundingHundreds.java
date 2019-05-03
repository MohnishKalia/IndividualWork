package loops;

import java.util.Scanner;
public class RoundingHundreds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input a 4 digit integer. (0 to terminate)");
		int num = input.nextInt();
		if (num <= 9999 && num > 999) {
		} else {
			System.out.println("Invalid input: Default Value is 3590");
			num = 3590;
		}
		while (num != 0) {
			num = (int) Math.floor(num / 100);
			num *= 100;
			System.out.println(num);
			System.out.println("Input a 4 digit integer. (0 to terminate)");
			num = input.nextInt();
		}
		input.close();
	}

}
