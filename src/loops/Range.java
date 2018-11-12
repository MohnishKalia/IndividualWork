package loops;

import java.util.Scanner;
public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your integer number? (9999 to terminate)");
		int num = input.nextInt();
		int min = num;
		int max = num;
		do {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
			System.out.println("What is your integer number? (9999 to terminate)");
			num = input.nextInt();
		} while (num != 9999);
		System.out.println("The range for this data set is: " + (max - min));
		input.close();
	}

}
