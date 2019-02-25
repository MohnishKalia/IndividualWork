package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		BinarySearch test = new BinarySearch();
		double[] arr = new double[1000];
		for (int i = 0; i < arr.length - 3; i++) {
			arr[i] = 5 * gen.nextDouble();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Input a double:");
			arr[i + arr.length - 3] = input.nextDouble();
		}
		Arrays.sort(arr);
		System.out.println("What is the double you are looking for?");
		if (test.doubleAscending(arr, input.nextDouble()))
			System.out.println("The double value was found within the array!");
		else
			System.out.println("The double value was not found :(");
		input.close();
	}

}