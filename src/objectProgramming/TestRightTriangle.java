package objectProgramming;

import java.util.Scanner;
public class TestRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightTriangle bob = new RightTriangle(5, 12);
		Scanner input = new Scanner(System.in);

		System.out.println(bob.hypot());
		System.out.println(bob.perimeter());
		System.out.println(bob.area());

		input.close();
	}

}
