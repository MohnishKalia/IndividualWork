package objectProgramming;

import java.util.Scanner;
public class TestGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Greeter bob = new Greeter();
		int age = bob.getAge();
		System.out.println(age);
		System.out.println("New age");
		int xAge = input.nextInt();
		int age = bob.setAge(xAge);
		System.out.println(age);
		bob.getAge();
	}

}
