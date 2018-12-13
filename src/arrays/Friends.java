package arrays;

import java.util.Scanner;

public class Friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int longest = 0;
		int smallest = 999;
		int sum = 0;
		String l = "";
		String s = "";
		System.out.println("How many friends do you know?");
		LongAndShort[] friends = new LongAndShort[input.nextInt()];
		for (int i = 0; i < friends.length; i++) {
			input.nextLine();
			System.out.println("What is your friend's name?");
			String name = input.nextLine();
			System.out.println("What is his age?");
			int xAge = input.nextInt();
			friends[i] = new LongAndShort(name, xAge);
		}
		// for longest smallest
		System.out.println("Friends:");
		for (int j = 0; j < friends.length; j++) {
			System.out.println(friends[j].getFull());
			String fullname = friends[j].getFull();
			// for the average
			sum += fullname.length() - 1;
			// for the average
			if (fullname.length() > longest) {
				longest = fullname.length();
				l = fullname;
			}
			if (fullname.length() < smallest) {
				smallest = fullname.length();
				s = fullname;
			}
		}
		// for longest smallest
		// for search
		System.out.println("");
		System.out.println("Input Search Parameter:\n1. First Name\n2. Last Name\n3. Age");
		int choice = input.nextInt();
		String comp = "";
		int xAge = 0;
		switch (choice) {
		case 1:
			input.nextLine();
			System.out.println("What is the First name?");
			comp = input.nextLine();
			break;
		case 2:
			input.nextLine();
			System.out.println("What is the Last name?");
			comp = input.nextLine();
			break;
		case 3:
			System.out.println("What is the age?");
			xAge = input.nextInt();
			break;
		}
		System.out.println("---------------");
		for (int k = 0; k < friends.length; k++) {
			if (friends[k].search(choice, comp, xAge)) {
				System.out.println(friends[k].getFull() + ", Age: " + friends[k].getAge());
			}
		}
		System.out.println("---------------");
		// for search
		System.out.println("Longest Name: " + l);
		System.out.println("Smallest Name: " + s);
		System.out.println("Range of Length: " + (l.length() - s.length()));
		System.out.println("Average Length: " + (sum / friends.length));
		input.close();
	}

}
