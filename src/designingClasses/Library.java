package designingClasses;

import java.util.ArrayList;
public class Library {
	private String name;
	private ArrayList<Book> repo;

	public Library() {
		name = "Generic Unknown Library in Nowhere";
		for (int i = 0; i < 10; i++) {
			repo.add(new Book());
		}
	}

	public Library(String xName, ArrayList<Book> col) {
		name = xName;
		repo = col;
	}

	public Book checkOut(int index) {
		return repo.remove(index);
	}

	public void returnBook(Book temp) {
		repo.add(temp);
	}

	public void fire() {
		repo.clear();
	}
}
