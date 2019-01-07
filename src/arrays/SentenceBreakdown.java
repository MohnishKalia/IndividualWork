package arrays;

import java.util.Scanner;
public class SentenceBreakdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		int[] ascii = new int[128];
		for (int i = 0; i < ascii.length; i++) {
			for (int j = 0; j < sen.length(); j++) {
				if (sen.charAt(j) == i)
					ascii[i]++;
			}
		}
		for (int k = 0; k < ascii.length; k++) {
			if (!(ascii[k] == 0))
				System.out.println("# of times '" + (char) k + "' appeared: " + ascii[k]);
		}
		input.close();
	}

}
/*
 * plan for the program create a 128 index-long int array to hold all ascii char
 * counts use for loop to check entire sentence for each char only shows ascii
 * with more than zero instances
 */