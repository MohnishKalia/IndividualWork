package randomNumbers;

import java.util.Random;
import java.util.Scanner;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Scanner input = new Scanner(System.in);
		int min = 1;
		System.out.println("How many sides on the die?");
		int max = input.nextInt();
		System.out.println("How many rolls?");
		int uBound = input.nextInt();

		for (int i = 0; i < uBound; i++) {
			int random = min + gen.nextInt(max - min + 1);
			System.out.println("Rolled " + random);
		}
		input.close();
	}

}
