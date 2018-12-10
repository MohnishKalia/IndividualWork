package arrays;

import java.util.Random;
import java.util.Scanner;

import objectProgramming.Rectangle;
public class Rectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int min = 10;
		int max = 56;
		Rectangle[] sides = new Rectangle[100];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = new Rectangle();
			sides[i].setWidth(min + gen.nextInt(max - min + 1));
			sides[i].setLength(min + gen.nextInt(max - min + 1));
			System.out.println("Width @ " + i + " : " + sides[i].returnWidth());
			System.out.println("Length @ " + i + " : " + sides[i].returnLength());
			System.out.println("Area @ " + i + " : " + sides[i].area());
		}
		input.close();
	}

}
