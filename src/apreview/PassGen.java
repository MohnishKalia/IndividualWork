package apreview;

import java.util.Scanner;

public class PassGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] words = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Word : " + (i + 1));
			words[i] = input.nextLine();
		}
		String pass = "";
		pass += words[0].charAt(0);
		pass += words[1].charAt(words[1].length() - 1);
		pass += words[2].charAt((int) (Math.random() * words[2].length()));
		pass += (int) (Math.random() * 1000);
		System.out.println(pass);
		input.close();
	}


}
