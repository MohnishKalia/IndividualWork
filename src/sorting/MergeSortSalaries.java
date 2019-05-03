package sorting;
import java.util.Scanner;
public class MergeSortSalaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that creates an double Array of 653 unsorted employee
		 * salaries ranging from 1 to 10,000,000. Allow the user to choose to display
		 * the salaries in ascending or descending order. Modify and use the Merge sort
		 * method in the JavaSorting class.
		 */
		Scanner input = new Scanner(System.in);
		double[] sal = new double[653];
		for (int i = 0; i < sal.length; i++) {
			sal[i] = 9999999 * Math.random() + 1;
		}
		System.out.println("How would you like the salaries to be displayed?");
		System.out.println("1. Ascending order");
		System.out.println("2. Descending order");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			Number[] funA = new Number[sal.length];
			for (int i = 0; i < sal.length; i++) {
				funA[i] = (Number) sal[i];
			}
			Sort.mergesortAscending(funA, 0, sal.length - 1);
			for (Number temp : funA) {
				System.out.println(temp.doubleValue());
			}
			break;
		case 2:
			Number[] funD = new Number[sal.length];
			for (int i = 0; i < sal.length; i++) {
				funD[i] = (Number) sal[i];
			}
			Sort.mergesortDescending(funD, 0, sal.length - 1);
			for (Number temp : funD) {
				System.out.println(temp.doubleValue());
			}
			break;
		default:
			System.out.println("Please try a choice from above.");
			break;
		}
		input.close();
	}

}
