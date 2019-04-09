package apreview;
import java.util.ArrayList;
import java.util.List;
public class FormLetter {

	/** The list of lines that make up this form letter */
	private List<String> lines;

	/** The list of customers */
	private List<Customer> customers;

	/** ©return a copy of lines */
	public List<String> makeCopy() {
		List<String> newLines = new ArrayList<String>();
		for (String line : lines)
			newLines.add(line);
		return newLines;
	}

	/**
	 * Replace all occurrences of sub in line with replacement string, repl.
	 * 
	 * @param line        a String
	 * @param sub         a substring to be replaced
	 * @param replacement the replacement string Precondition: sub is not a
	 *                    substring of repl, the replacement string.
	 * @return line with each occurrence of sub replaced by replacement
	 */
	public String replaceAll(String line, String sub, String repl) { /* to be implemented in part (a) */
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++)
			if (words[i] == sub)
				words[i] = repl;
		return String.join(" ", words);
	}

	/**
	 * Write letter for one customer, using personalized lines contained in
	 * customerLines.
	 * 
	 * @param customerLines the personalized lines for one customer
	 */
	public void writeLetter(List<String> customerLines) {
		/* implementation not shown */}

	/**
	 * Creates and prints a personalized form letter for each customer in the
	 * customers list. Postcondition: In each customer letter: - every occurrence of
	 * "@" is replaced by the customer's name; - every occurrence of "&" is replaced
	 * by the customer's city; - every occurrence of 11$
	 * 
	 * 11 is replaced by the customer's state. - A letter with the replacements is
	 * printed for each customer.
	 */
	public void createPersonalizedLetters() {
		/* to be implemented in part (b) */

		for (int i = 0; i < customers.size(); i++) {
			// for each customer
			List<String> copy = makeCopy();
			for (int j = 0; j < lines.size(); j++) {
				// for each line
				Customer curC = customers.get(i);
				String curS = copy.get(j);
				curS = replaceAll(curS, "@", curC.getName());
				curS = replaceAll(curS, "&", curC.getCity());
				curS = replaceAll(curS, "$", curC.getState());
				copy.set(j, curS);
			}
			writeLetter(copy);
		}
	}
	// Constructors and other methods are not shown.
}
