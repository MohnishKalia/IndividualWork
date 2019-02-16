package searching;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Sat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		int min = 1500;
		int max = 2400;
		for (int i = 0; i < 1000; i++) {
			scores.add(min + gen.nextInt(max - min + 1));
		}
		int search = min + gen.nextInt(max - min + 1);
		boolean flag = false;
		for (int temp : scores) {
			if (temp == search) {
				flag = true;
				break;
			}
		}
		System.out.println("Is " + search + " in the ArrayList? " + flag);
		input.close();
	}

}
