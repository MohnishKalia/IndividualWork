package objectProgramming;

import java.util.Scanner;

public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat bob = new Cat(8, 12);
		Scanner input = new Scanner(System.in);

		System.out.println("Age stuff");
		System.out.println(bob.getAge());
		bob.birthday();
		System.out.println(bob.getAge());
		System.out.println("Sleep stuff");
		System.out.println(bob.getSleep());
		bob.sleepMore();
		System.out.println(bob.getSleep());
		bob.sleepLess();
		System.out.println(bob.getSleep());

		System.out.println("New age?");
		int xAge = input.nextInt();
		bob.setAge(xAge);

		System.out.println("New sleep?");
		int xSleep = input.nextInt();
		bob.setSleep(xSleep);

		System.out.println("Age stuff");
		System.out.println(bob.getAge());
		bob.birthday();
		System.out.println(bob.getAge());
		System.out.println("Sleep stuff");
		System.out.println(bob.getSleep());
		bob.sleepMore();
		System.out.println(bob.getSleep());
		bob.sleepLess();
		System.out.println(bob.getSleep());

		input.close();
	}

}
