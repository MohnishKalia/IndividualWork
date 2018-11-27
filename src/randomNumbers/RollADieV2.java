package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RollADieV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Scanner input = new Scanner(System.in);
		int min = 1;
		int max = 6;
		System.out.println("How many rolls?");
		int uBound = input.nextInt();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		for (int i = 0; i < uBound; i++) {
			int random = min + gen.nextInt(max - min + 1);
			switch (random) {
			case 1:
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			case 4:
				num4++;
				break;
			case 5:
				num5++;
				break;
			case 6:
				num6++;
				break;
			}
		}
		System.out.println("Number of times 1 was rolled: " + num1);
		System.out.println("Percentage of 1 rolls: " + (100 * ((double) num1 / uBound)) + "%");
		System.out.println(" ");

		System.out.println("Number of times 2 was rolled: " + num2);
		System.out.println("Percentage of 2 rolls: " + (100 * ((double) num2 / uBound)) + "%");
		System.out.println(" ");

		System.out.println("Number of times 3 was rolled: " + num3);
		System.out.println("Percentage of 3 rolls: " + (100 * ((double) num3 / uBound)) + "%");
		System.out.println(" ");

		System.out.println("Number of times 4 was rolled: " + num4);
		System.out.println("Percentage of 4 rolls: " + (100 * ((double) num4 / uBound)) + "%");
		System.out.println(" ");

		System.out.println("Number of times 5 was rolled: " + num5);
		System.out.println("Percentage of 5 rolls: " + (100 * ((double) num5 / uBound)) + "%");
		System.out.println(" ");

		System.out.println("Number of times 6 was rolled: " + num6);
		System.out.println("Percentage of 6 rolls: " + (100 * ((double) num6 / uBound)) + "%");

		input.close();
	}

}
