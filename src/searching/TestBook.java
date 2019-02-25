package searching;
import java.util.ArrayList;
import java.util.Scanner;
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> lib = new ArrayList<Book>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			lib.add(new Book());
		}
		System.out.println("Book Lookup:");
		System.out.println("What is the name of the book?");
		String searchN = input.nextLine();
		System.out.println("How many pages are in the book?");
		int searchI = input.nextInt();
		Book search = new Book(searchN, searchI);
		boolean found = false;
		int countP = 0;
		int countL = 0;
		for (Book temp : lib) {
			if (search.getPages() == temp.getPages()) {
				countP++;
			}
			if (search.getTitle().length() == temp.getTitle().length()) {
				countL++;
			}
			if (temp.equals(search)) {
				found = true;
			}
		}
		System.out.println(countP + " books have the same number of pages.");
		System.out.println(countL + " books have the same title length.");
		if (found)
			System.out.println("Exact book found!");
		else
			System.out.println("Exact book not found :(");
		input.close();
	}

}
