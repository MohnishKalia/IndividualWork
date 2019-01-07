package arrays;

import java.util.Random;

import objectProgramming.Circle;
public class CircleReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Circle[] geo = new Circle[24];
		double sum = 0;
		int min = 1;
		int max = 60;
		for (int i = 0; i < geo.length; i++) {
			geo[i] = new Circle(gen.nextInt(min + (max - min + 1)));
			sum += geo[i].area();
		}
		System.out.println("The combined area is " + sum);
	}

}
