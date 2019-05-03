package arrays;

import java.util.Random;
import java.util.Scanner;
public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		System.out.println("How many people are in the class?");
		final int students = input.nextInt();
		System.out.println("How many sides are on the die?");
		int min = 1;
		int max = input.nextInt();
		System.out.println("How many times will each student roll the dice?");
		final int tries = input.nextInt();
		int[][] rolls = new int[students][tries];
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < tries; j++) {
				rolls[i][j] = min + gen.nextInt(max - min + 1);
			}
		}
		System.out.println("Rolls, student by student-");
		for (int i = 0; i < students; i++) {
			System.out.println("\nStudent " + (i + 1) + ":");
			for (int j = 0; j < tries; j++) {
				System.out.print((rolls[i][j] = min + gen.nextInt(max - min + 1)) + " ");
			}
		}
		System.out.println("\n\nRolls, roll by roll-\n");
		int rollTotal = min;
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < tries; j++) {
				System.out.println("Roll " + rollTotal + ": " + (rolls[i][j] = min + gen.nextInt(max - min + 1)));
				rollTotal++;
			}
		}
		System.out.println("What value would you like to see the occurances of?");
		int search = input.nextInt();
		int occur = 0;
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < tries; j++) {
				if (rolls[i][j] == search) {
					occur++;
				}
			}
		}
		System.out.println(occur + " Occurances");
		input.close();
	}

}
