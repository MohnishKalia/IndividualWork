package searching;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectProgramming.Circle;
public class Circles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		ArrayList<Circle> sphere = new ArrayList<Circle>();
		int min = 0;
		int max = 499;
		for (int i = 0; i < 1000; i++) {
			sphere.add(new Circle(min + gen.nextInt(max - min + 1)));
		}
		int count = 0;
		for (int i = 1; i < sphere.size(); i++) {
			if (Math.abs(sphere.get(1).area() - sphere.get(i).area()) <= 1e-14)
				count++;
		}
		System.out.println(count + " circles in the ArrayList have the same area as the first circle.");
		input.close();
	}

}
