package sorting;

import java.util.Random;
public class SpeedOfSorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Generate an array of 100,000 random numbers from 1 to 1,000,000.  Make 3
		 * copies of it.  Use the selection, insertion, and merge sorts to sort each
		 * array.  Display the time it took for each sorting algorithm to sort each
		 * array.
		 */
		Random gen = new Random();
		int[] nums = new int[100000];
		int min = 1;
		int max = 1000000;
		long start, stop;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = min + gen.nextInt(max - min + 1);
		}
		int[] sel = nums.clone();
		int[] ins = nums.clone();
		Number[] mer = Sort.numberArrayConverter(nums);


		start = System.currentTimeMillis();
		Sort.selectionSortAscending(sel);
		stop = System.currentTimeMillis();
		System.out.println("The number of milliseconds for the selection sort was: " + (start - stop));

		start = System.currentTimeMillis();
		Sort.insertionSortAscending(ins);
		stop = System.currentTimeMillis();
		System.out.println("The number of milliseconds for the insertion sort was: " + (start - stop));

		start = System.currentTimeMillis();
		Sort.mergesortAscending(mer, 0, mer.length - 1);
		stop = System.currentTimeMillis();
		System.out.println("The number of milliseconds for the merge sort was: " + (start - stop));
	}

}
