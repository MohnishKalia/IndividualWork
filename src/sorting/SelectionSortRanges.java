package sorting;

import java.util.Random;

public class SelectionSortRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		int min = 0;
		int max = 1000000;
		int[][] arr = new int[1000][100];
		int[] ranges = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = min + gen.nextInt(max - min + 1);
			}
			Sort.selectionSortAscending(arr[i]);
			ranges[i] = arr[i][arr[0].length - 1] - arr[i][0];
			System.out.println("Range of Array " + i + ": " + ranges[i]);
		}
		Sort.selectionSortAscending(ranges);
		System.out.println("Smallest Range: " + ranges[0]);
		System.out.println("Largest Range: " + ranges[ranges.length - 1]);
		System.out.println("Range of Ranges: " + (ranges[ranges.length - 1] - ranges[0]));
	}

}
