package randomNumbers;

import java.util.Random;

public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		int min = 1;
		int max = 6;
		int rolls = 0;
		boolean yahtzee = false;

		while (yahtzee == false) {
			int random1 = min + gen.nextInt(max - min + 1);
			int random2 = min + gen.nextInt(max - min + 1);
			int random3 = min + gen.nextInt(max - min + 1);
			int random4 = min + gen.nextInt(max - min + 1);
			int random5 = min + gen.nextInt(max - min + 1);
			rolls++;
			if (random1 == random2 && random3 == random4 && random5 == random1 && random5 == random3) {
				yahtzee = true;
			}
		}
		System.out.println("Yahtzee in this many rolls: " + rolls);
	}

}
