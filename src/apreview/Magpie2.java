package apreview;

/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>Uses indexOf to find strings</li>
 * <li>Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.contains("dog") || statement.contains("cat")) {
			response = "Tell me more about your pets.";
		} else if (statement.contains("tennis")) {
			response = "You like tennis too? Great.";
		}
		//else if (!statement.matches("\\*\\S\\*"))
		else if (statement.trim().isEmpty()) 
		{
			response = "What are you, some runner? Get some letters.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		switch (whichResponse) {
		case 0:
			response = "Interesting, tell me more.";
			break;
		case 1:
			response = "Hmmm.";
			break;
		case 2:
			response = "Do you really think so?";
			break;
		case 3:
			response = "You don't say.";
			break;
		default:
			response = "Big issue.";
			break;
		}
		return response;
	}
}
