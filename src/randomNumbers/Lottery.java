package randomNumbers;

import java.util.Random;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("What is your minimum of the range?");
		int min = input.nextInt();
		System.out.println("What is the maximum of the range?");
		int max = input.nextInt();
		if (max < min) {
			max = min + 500;
		}
		System.out.println("First winning number");
		int tar1 = input.nextInt();
		System.out.println("Second winning number");
		int tar2 = input.nextInt();
		System.out.println("Third winning number");
		int tar3 = input.nextInt();
		System.out.println("Fourth winning number");
		int tar4 = input.nextInt();
		int rolls = 0;
		boolean lottery = false;
		while (lottery == false) {
			int random1 = min + gen.nextInt(max - min + 1);
			int random2 = min + gen.nextInt(max - min + 1);
			int random3 = min + gen.nextInt(max - min + 1);
			int random4 = min + gen.nextInt(max - min + 1);
			rolls++;
			if (random1 == tar1 && random2 == tar2 && random3 == tar3 && random4 == tar4) {
				lottery = true;
			}
		}
		System.out.println("Won the lottery in this many rolls: " + rolls);
		input.close();
	}

}
