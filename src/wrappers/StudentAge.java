package wrappers;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAge {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ages = new ArrayList<Integer>();
		System.out.println("How many people are in the class?");
		for (int i = 0; i < input.nextInt(); i++) {
			System.out.println("What is the student's age?");
			ages.add(input.nextInt());
        }
        int sum = 0;
        for (int j : ages) {
            sum += j;
        }
        System.out.println("Average Age: " + (double)(sum)/ages.size());
		input.close();
	}
}