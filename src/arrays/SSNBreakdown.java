package arrays;

import java.util.Scanner;
public class SSNBreakdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] sums = new int[10];
		int[] last = new int[40];
		int max = 0;
		int min = 20;
		int maxP = 0;
		int minP = 20;
		int sum = 0;
		int l = 0;
		/*
		 * Note: still have to find a way to parse char into appropriate int Update:
		 * Used casting in order to change the data type, but have not tested as of yet
		 */
		for (int i = 0; i < sums.length; i++) {
			System.out.println("What is your SSN (***-**-****)");
			String ssn = input.nextLine();
			String four = ssn.substring(ssn.lastIndexOf("-"));
			for (int k = 0; k < four.length(); k++) {
				last[k + 4 * l] = (int) four.charAt(k);
			}
			l++;
			sums[i] = (int) (ssn.charAt(4) + ssn.charAt(5));
		}
		for (int j = 0; j < sums.length; j++) {
			if (sums[j] > max)
				max = sums[j];
			if (sums[j] < min)
				min = sums[j];
			sum += sums[j];
		}
		for (int j = 0; j < last.length; j++) {
			if (last[j] > maxP)
				maxP = last[j];
			if (last[j] < minP)
				minP = last[j];
		}

		System.out.println("Max sum: " + max);
		System.out.println("Min sum: " + min);
		System.out.println("Average: " + sum / sums.length);
		System.out.println("Range of last 4: " + (maxP - minP));
		input.close();
	}

}
