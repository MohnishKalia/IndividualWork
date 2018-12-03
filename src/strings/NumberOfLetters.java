package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		// asks for sentence
		String senC = sen.toLowerCase();
		// converts sentence into lowercase for easier ASCII comparison
		int vowel = 0;
		int cons = 0;
		int per = 0;
		// counting variables initialized
		for (int i = 0; i < senC.length(); i++) {
			switch (senC.charAt(i)) {
			// compares every character of the sentence for value in switch
			case 'a':
				vowel++;
				break;
			case 'e':
				vowel++;
				break;
			case 'i':
				vowel++;
				break;
			case 'o':
				vowel++;
				break;
			case 'u':
				vowel++;
				break;
			case 'y':
				vowel++;
				break;
			case '.':
				per++;
				break;
			case '!':
				per++;
				break;
			case '?':
				per++;
				break;
			case ',':
				per++;
				break;
			case ';':
				per++;
				break;
			case ':':
				per++;
				break;
			default:
				if (senC.charAt(i) >= 97 && senC.charAt(i) <= 122) {
					// if not any punctuation or vowel, and in between ASCII lowercase letters,
					// increment
					cons++;
				}
				break;
			}
		}
		System.out.println("There are " + vowel + " vowels in the sentence");
		System.out.println("There are " + cons + " consonants in the sentence");
		System.out.println("There are " + per + " punctuation marks in the sentence");
		input.close();
	}

}
