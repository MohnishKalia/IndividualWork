package strings;

public class Essay {
	private String name;
	private String nameL;
	private String nameF;
	private String text;
	private int words;
	private boolean contain;
	private boolean contin;

	public Essay() {
		words = 0;
		contain = false;
		contin = true;
	}

	public void setName(String nameX) {
		name = nameX;
		nameF = name.substring(0, name.indexOf(" "));
		nameL = name.substring(name.indexOf(" ") + 1);
	}

	public void setText(String textX) {
		words = 0;
		text = textX;
	}

	public String capitalLastName() {
		return nameL.toUpperCase();
	}

	public int charInFirstName() {
		return nameF.length();
	}

	public boolean containsX() {
		if (name.contains("X")) {
			contain = true;
		} else {
			contain = false;
		}
		return contain;
	}

	public int wordCount() {
		contin = true;
		for (int i = 0; contin; i++) {
			String full = text.substring(i);
			if (!(full.contains(" "))) {
				contin = false;
			}
			words++;
			i += full.indexOf(32);
		}
		return words;
	}
}
