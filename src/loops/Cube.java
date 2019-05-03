package loops;

import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your integer? (-1 to terminate)");
		int num = input.nextInt();
		while (num != -1) {
			System.out.println(num * num * num);
			System.out.println("What is your integer? (-1 to terminate)");
			num = input.nextInt();
		}
		input.close();
	}

}
