package searching;

import java.util.Random;
import java.util.Scanner;
public class FunActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int[] scores = new int[100];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = gen.nextInt(500);
		}
		System.out.println("What integer would you like to search for?");
		int search = input.nextInt();
		int count = 0;
		for (int temp : scores) {
			if (temp == search)
				count++;
		}
		System.out.println(search + " is in the Array " + count + " times.");
		input.close();
	}

}
