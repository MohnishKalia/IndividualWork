package arrayList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectProgramming.Friend;
public class WhoIsMyFriendAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Scanner input = new Scanner(System.in);
		ArrayList<Friend> friends = new ArrayList<Friend>();
		System.out.println("How many friends do you have?");
		for (int i = 0; i < input.nextInt(); i++) {
			System.out.println("What is their name?");
			String name = input.nextLine();
			System.out.println("What is their age?");
			int age = input.nextInt();
			friends.add(new Friend(name, age));
		}
		boolean event = gen.nextBoolean();
		if (event) {
			System.out.println("Double your friends!");
			final int quota = friends.size();
			for (int j = 0; j < quota; j++) {
				System.out.println("What is their name?");
				String name = input.nextLine();
				System.out.println("What is their age?");
				int age = input.nextInt();
				friends.add(new Friend(name, age));
			}
		} else {
			int min = 0;
			int max = friends.size();
			System.out.println("Black Death Simulator :<");
			int lotto = min + gen.nextInt(max - min + 1);
			Friend savior = friends.remove(lotto);
			friends.clear();
			friends.add(savior);
		}
		for (int k = 0; k < friends.size(); k++) {
			System.out.println(friends.get(k).getName() + " | Age: " + friends.get(k).getAge());
		}
		input.close();
	}

}
