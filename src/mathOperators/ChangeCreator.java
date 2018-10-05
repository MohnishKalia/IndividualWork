package mathOperators;
import java.util.Scanner;
public class ChangeCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double money;
		double safeMoney;
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		System.out.println("How much money are you creating change for ($)?");
		money = input.nextDouble();
		safeMoney = money;
		dollars = (int)Math.floor(money);
		money = money-dollars;
		quarters = (int)Math.floor((money)/(0.25));
		money = money-0.25*quarters;
		dimes = (int)Math.floor((money)/(0.10));
		money = money-0.1*dimes;
		nickels = (int)Math.floor((money)/(0.05));
		money = money-0.05*nickels;
		pennies = (int)Math.round((money)/(0.01));
		System.out.println("For " + safeMoney + " dollars, the change is...");
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		input.close();
	}

}
