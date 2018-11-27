package randomNumbers;

import java.util.Random;
public class HeadsTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random(3);
		int min = 1;
		int max = 2;
		int heads = 0;
		int tails = 0;

		for (int i = 0; i < 100000; i++) {
			int random = min + gen.nextInt(max - min + 1);
			if (random == 1) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("There were " + heads + " heads");
		System.out.println("There were " + tails + " tails");
	}

}
