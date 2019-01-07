package arrays;

import java.util.Random;
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		int min = 1;
		int max = 17;
		int[] brook = new int[1340];
		int count = 0;
		for (int i = 0; i < brook.length;i++) {
			brook[i] = min + gen.nextInt(max - min + 1);
		}
		for (int j = brook.length - 1; j >= 0; j--) {
			if (brook[j] > 7)
				System.out.println(brook[j]);
			if (brook[j] % 2 == 0)
				count++;
		}
		System.out.println("Percentage of households with even # of students: " + ((double) count / brook.length));
	}

}