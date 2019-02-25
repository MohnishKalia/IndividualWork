package searching;
import java.util.ArrayList;
import java.util.Scanner;
public class NameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a person's name here:");
			names.add(input.nextLine());
		}
		System.out.println("Input a name to search for:");
		String search = input.nextLine();
		boolean found = false;
		for (String temp : names) {
			found = temp.equals(search);
		}
		if (found)
			System.out.println("The name was found!");
		else
			System.out.println("Name not found :(");
		input.close();
	}

}
