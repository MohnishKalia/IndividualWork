package arrays;

import java.util.Random;

import objectProgramming.Rectangle;
public class RectangleReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Rectangle[][] geo = new Rectangle[11][14];
		int min = 1;
		int max = 100;
		double sum = 0;
		for (int row = 0; row < geo.length; row++) {
			for (int col = 0; col < geo[0].length; col++) {
				double l = min + gen.nextInt(max - min + 1);
				double w = min + gen.nextInt(max - min + 1);
				geo[row][col] = new Rectangle(l, w);
				sum += geo[row][col].perimeter();
			}
		}
		System.out.println("The combined perimeter is " + sum);
	}

}
