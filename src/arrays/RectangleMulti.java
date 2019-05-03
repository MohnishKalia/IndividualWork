package arrays;

import java.util.Random;

import objectProgramming.Rectangle;
public class RectangleMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		final int min = 0;
		final int max = 100;
		Rectangle[][] excel = new Rectangle[18][5];
		for (int row = 0; row < excel.length; row++) {
			for (int col = 0; col < excel[0].length; col++) {
				excel[row][col] = new Rectangle();
				excel[row][col].setLength(min + gen.nextInt(max - min + 1));
			}
		}
		for (int row = 0; row < excel.length; row++) {
			for (int col = 0; col < excel[0].length; col++) {
				System.out.print((int) excel[row][col].returnLength() + " ");
			}
			System.out.println(" ");
		}

	}

}
