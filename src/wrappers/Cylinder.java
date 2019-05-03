package wrappers;

import java.util.Scanner;

import objectProgramming.Circle;
public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Circle[] cylinder = new Circle[10];
		for (int i = 0; i < cylinder.length; i++) {
			System.out.println("What is the radius of the circle?");
			cylinder[i] = new Circle(input.nextDouble());
		}
		for (Circle temp : cylinder)
			System.out.println(temp.area());
		input.close();
	}

}
