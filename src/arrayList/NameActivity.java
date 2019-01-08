package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class NameActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Jane");
		names.add(0, "Billy");
		System.out.println("What is your name?");
		names.add(input.nextLine());
		if (names.size() > 1) {
		String first = names.remove(0);
		String last = names.remove(names.size() - 1);
		System.out.println("Outcast Names D: " + first + last);
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		input.close();
	}

}
