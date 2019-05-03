package arrays;

import java.util.Scanner;
public class FriendNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		for (int i = 0; i < names.length; i++) {
			System.out.println("What is your friend's name? first last");
			names[i] = input.nextLine();
		}
		for (int j = names.length - 1; j >= 0; j--) {
			System.out.println(names[j]);
		}
		System.out.println("What is the letter that you are searching?");
		String des = input.nextLine();
		for (int k = 0; k < names.length; k++) {
			String sub = names[k];
			if (sub.charAt(sub.length() - 1) == des.charAt(0))
				System.out.println(names[k]);
		}
		System.out.println("What is the length of the first name you are searching?");
		int len = input.nextInt();
		int match = 0;
		for (int n = 0; n < names.length; n++) {
			String trunc = names[n].substring(0, names[n].indexOf(" "));
			if (trunc.length() == len)
				match++;
		}
		System.out.println("There were " + match + " names that had the same length.");

		input.close();
	}

}
