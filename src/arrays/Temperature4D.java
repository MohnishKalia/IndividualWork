package arrays;

import java.util.Random;
import java.util.Scanner;
public class Temperature4D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();

		// [year][month][week][day]
		final int year = 10;
		final int month = 12;
		final int week = 4;
		final int day = 7;

		final int min = -20;
		final int max = 110;

		double dailyMax = -999;
		double monthMax = -999;

		double[][][][] temps = new double[year][month][week][day];

		for (int i = 0; i < year; i++) {
			for (int j = 0; j < month; j++) {
				for (int k = 0; k < week; k++) {
					for (int l = 0; l < day; l++) {
						temps[i][j][k][l] = min + gen.nextInt(max - min + 1);
					}
				}
			}
		}

		// for daily maximum temp
		int indexY = 0;
		int indexM = 0;
		int indexW = 0;
		int indexD = 0;
		// for daily maximum temp

		for (int i = 0; i < year; i++) {
			for (int j = 0; j < month; j++) {
				for (int k = 0; k < week; k++) {
					for (int l = 0; l < day; l++) {
						if (temps[i][j][k][l] > dailyMax) {
							dailyMax = temps[i][j][k][l];
							indexY = i;
							indexM = j;
							indexW = k;
							indexD = l;
						}
					}
				}
			}
		}
		System.out.println("Highest daily temp: " + temps[indexY][indexM][indexW][indexD] + " @ (Year Month Week Day); "
				+ (indexY + 1) + " " + (indexM + 1) + " " + (indexW + 1) + " " + (indexD + 1));

		// for monthly max average temp
		double globalAvg = 0;
		// for monthly max average temp

		for (int i = 0; i < year; i++) {
			for (int j = 0; j < month; j++) {
				double localSum = 0;
				for (int k = 0; k < week; k++) {
					for (int l = 0; l < day; l++) {
						localSum += temps[i][j][k][l];
					}
				}
				double placeAvg = (localSum / (week * month));
				if (placeAvg > monthMax) {
					indexY = i;
					indexM = j;
					globalAvg = monthMax = placeAvg;
				}
			}
		}
		System.out.println(
				"Highest average monthly temp: " + globalAvg + " @ (Year Month); " + (indexY + 1) + " " + (indexM + 1));

		System.out.println("What is the year you wish to inspect?");
		int iYear = input.nextInt();
		for (int j = 0; j < month; j++) {
			System.out.println("\nMonth: " + (j + 1));
			for (int k = 0; k < week; k++) {
				for (int l = 0; l < day; l++) {
					System.out.print(temps[iYear][j][k][l] + " ");
				}
			}
		}

		input.close();
	}

}
