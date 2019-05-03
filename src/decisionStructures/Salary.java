package decisionStructures;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you make in a year?");
		double salary = input.nextDouble();
		if (salary < 20000) {
			System.out.println("You are probabaly a worker");
		}
		if (salary >= 20000 && salary <= 40000) {
			System.out.println("You are probabaly management");
		}
		if (salary > 40000 && salary <= 100000) {
			System.out.println("You are probabaly a CEO");
		}
		if (salary > 100000) {
			System.out.println("You are probabaly an owner");
		}
		input.close();
	}
}
