package searching;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectProgramming.Circle;
import objectProgramming.Rectangle;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		ArrayList<Object> cong = new ArrayList<Object>();
		int min = 0;
		int max = 499;
		for (int i = 0; i < 1000; i++) {
			cong.add(new Rectangle(min + gen.nextInt(max - min + 1), min + gen.nextInt(max - min + 1)));
			cong.add(new Circle(min + gen.nextInt(max - min + 1)));
		}
		int count = 0;
		for (Object temp : cong) {
			if (temp instanceof Circle) {
				if (((Circle) temp).returnRadius() == 10) {
					count++;
				}
			}
		}
		System.out.println(count + " circles in the ArrayList have a radius of 10");
		input.close();
	}

}
