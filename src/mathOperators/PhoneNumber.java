package mathOperators;
import java.util.Scanner;
public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long phone;
		long area;
		long middle;
		long last;
		System.out.println("What is your phone number (area code, no dashes)?");
		phone = input.nextLong();
		last = phone%10000;
		middle = ((phone-last)%10000000)/10000;
		area = (phone-middle-last)/10000000;
		System.out.println("Your phone number is " + phone);
		System.out.println("Your area code is " + area);
		System.out.println("Your middle numbers are " + middle);
		System.out.println("Your last 4 numbers are " + last);
		input.close();
	}

}
