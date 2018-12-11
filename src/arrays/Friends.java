package arrays;

import java.util.Scanner;

public class Friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int longest = 0;
		int smallest = 999;
		String l = "";
		String s = "";
		System.out.println("How many friends do you know?");
		LongAndShort[] friends = new LongAndShort[input.nextInt()];
		for (int i = 0; i < friends.length; i++) {
			System.out.println("What is your friend's name?");
			friends[i] = new LongAndShort(input.nextLine());
		}
		for (int j = 0; j < friends.length; j++) {
			System.out.println(friends[j].getFull());
			String fullname = friends[j].getFull();
			if (fullname.length() > longest) {
				longest = fullname.length();
				l = fullname;
			}
			if (fullname.length() < smallest) {
				smallest = fullname.length();
				s = fullname;
			}
		}
		System.out.println("Longest Name: " + l);
		System.out.println("Smallest Name: " + s);
		System.out.println("Range: " + (l.length() - s.length()));
		input.close();
	}

}
