package randomNumbers;

import java.util.Random;
public class Sided13Die {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random(0);
		int min = 1;
		int max = 13;
		int mult = 0;

		for (int i = 0; i < 87; i++) {
			int random = min + gen.nextInt(max - min + 1);
			if (random % 3 == 0) {
				mult++;
			}
		}
		System.out.println("There were " + mult + " rolls that were multiples of 3");
	}

}
