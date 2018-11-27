package randomNumbers;

import java.util.Random;

public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		int min = 1;
		int max = 2;
		int heads = 0;
		double maxHeads = 0;
		double minHeads = 100;
		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < 100000; i++) {
				int random = min + gen.nextInt(max - min + 1);
				if (random == 1) {
					heads++;
				}
			}
			double headPer = 100.0 * (heads / 100000.0);
			if (headPer > maxHeads) {
				maxHeads = headPer;
			}
			if (headPer < minHeads) {
				minHeads = headPer;
			}
			heads = 0;
		}
		System.out.println("Max Heads percentage: " + maxHeads + "%");
		System.out.println("Min Heads percentage: " + minHeads + "%");
	}

}
