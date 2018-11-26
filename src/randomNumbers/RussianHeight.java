package randomNumbers;

import java.util.Random;

public class RussianHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random(0);
		int min = 26;
		int max = 43;
		int tall = 0;

		for (int i = 0; i < 248; i++) {
			int random = min + gen.nextInt(max - min + 1);
			if (random > 36) {
				tall++;
			}
		}
		System.out.println("There were " + tall + " first graders that were taller than 3 feet");
	}

}
