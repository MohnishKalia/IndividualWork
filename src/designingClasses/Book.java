package designingClasses;

public class Book {
	private String title;
	private int pages;

	public Book() {

	}

	public Book(String xTitle, int xPages) {
		title = xTitle;
		if (xPages >= 0) {
			pages = xPages;
		} else {
			pages = 9898;
		}
	}

	public String getTitle() {
		return title;
	}

	public int getPages() {
		return pages;
	}

	public Book clone() {
		return new Book(title, pages);
	}

	public boolean equals(Object e) {
		if (e == this.clone())
			return true;
		return false;
	}

	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}
