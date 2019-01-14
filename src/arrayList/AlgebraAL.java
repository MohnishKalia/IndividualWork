package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

import objectProgramming.Student;
public class AlgebraAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min = 150;
		int minI = 0;
		int max = 0;
		int maxI = 0;
		ArrayList<Student> algebra = new ArrayList<Student>();
		System.out.println("How many students are in the class?");
		for (int i = 0; i < input.nextInt(); i++) {
			input.nextLine();
			System.out.println("What is the student's name?");
			String name = input.nextLine();
			System.out.println("What is the student's score?");
			int score = input.nextInt();
			algebra.add(new Student(name, score));
		}
		System.out.println("What student name would you like to remove?");
		String delete = input.nextLine();
		for (int j = 0; j < algebra.size(); j++) {
			if (algebra.get(j).returnName() == delete) {
				algebra.remove(j);
			} else {
				System.out.println("Student: " + (j + 1));
				System.out.println(algebra.get(j).returnName());
				System.out.println(algebra.get(j).returnScore());
				if (algebra.get(j).returnScore() > max) {
					max = algebra.get(j).returnScore();
					maxI = j;
				}
				if (algebra.get(j).returnScore() < min) {
					min = algebra.get(j).returnScore();
					minI = j;
				}
			}
		}
		System.out.println("Highest Scorer: " + algebra.get(maxI).returnName() + " with score of "
				+ algebra.get(maxI).returnScore());
		System.out.println("Lowest Scorer: " + algebra.get(minI).returnName() + " with score of "
				+ algebra.get(minI).returnScore());
		input.close();
	}

}
