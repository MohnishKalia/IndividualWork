package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollADieExt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int min = 1;
		int max = 6;
		boolean flag = true;
		int[] diceRolls = new int[10000];
		for (int i = 0; i < diceRolls.length; i++) {
			diceRolls[i] = min + gen.nextInt(max - min + 1);
		}
		while (flag) {
			System.out.println("What roll result would you like to see? (1 to 6)");
			int j = input.nextInt();
			for (int k = 0; k < diceRolls.length; k++) {
				if (diceRolls[k] == j) {
					System.out.println(diceRolls[k] + " @roll " + (k + 1));
				}
			}
			System.out.println("Would you like to continue? true/false");
			flag = input.nextBoolean();
		}
		input.close();
	}

}
