package objectProgramming;

import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bob = new Employee();
		Scanner input = new Scanner(System.in);

		double wage = bob.getWage();
		System.out.println(wage);
		System.out.println("New wage");
		double xWage = input.nextDouble();
		bob.setWage(xWage);
		System.out.println(bob.getWage());

		int exp = bob.getExp();
		System.out.println(exp);
		System.out.println("New experience");
		int xExp = input.nextInt();
		bob.setExp(xExp);
		System.out.println(bob.getExp());

		System.out.println(wage);
		System.out.println("New raised wage");
		bob.raiseWage();
		System.out.println(bob.getWage());

		input.close();
	}

}
