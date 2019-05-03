package wrappers;

import java.util.Scanner;

public class EmployeeWages {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many employees within the company?");
        double[] wages = new double[input.nextInt()];
        for (int i = 0; i < wages.length; i++) {
            System.out.println("Input the wage of the employee:");
            wages[i] = input.nextDouble();
        }
        double max = 0;
        for (double temp : wages) {
            if (temp > max)
                max = temp; 
        }
        System.out.println("Highest Wage: " + max);
        input.close();
    }
}