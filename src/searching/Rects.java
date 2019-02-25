package searching;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import designingClasses.Rectangle;

public class Rects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		ArrayList<Rectangle> cube = new ArrayList<Rectangle>();
		int min = 0;
		int max = 499;
		for (int i = 0; i < 100; i++) {
			cube.add(new Rectangle(min + gen.nextInt(max-min+1),min + gen.nextInt(max-min+1)));
		}
		int count = 0;
		for (Rectangle temp : cube) {
			if (temp.getWidth() == 10)
				count++;
		}
		System.out.println(count + " rectangles in the ArrayList have a width of 10");
		input.close();
	}

}
