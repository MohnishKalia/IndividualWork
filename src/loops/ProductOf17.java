package loops;

import java.util.Scanner;
public class ProductOf17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your integer number? (9999 to terminate)");
		int num = input.nextInt();
		do {
			System.out.println("Magic product is: " + num * 17);
			System.out.println("What is your integer number? (9999 to terminate)");
			num = input.nextInt();
		} while (num != 9999);
		input.close();
	}

}
