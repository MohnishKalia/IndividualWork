package arrays;

import java.util.Scanner;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		String[] teachers = new String[10];
		for (int i = 0; i < teachers.length; i++) {
			System.out.println("::Input " + (i + 1) + "::\nWhat is the teacher's name: FirstName LastName");
			String name = input.nextLine();
			teachers[i] = name.substring(name.indexOf(" ") + 1);
			sum += teachers[i].length();
		}
		System.out.println("Average Length of the Last Names: " + sum / 10);
		input.close();
	}
}
