package searching;

import java.util.ArrayList;

public class BinarySearch {
	public BinarySearch() {

	}

	public boolean doubleAscending(double[] arr, double search) {
		int mindex = 0;
		int maxdex = arr.length;
		while (mindex <= maxdex) {
			int avgdex = (maxdex + mindex) / 2;
			double diff = search - arr[avgdex];
			if (Math.abs(diff) <= 1e-14) {
				// same
				return true;
			}
			else if (diff < 0) {
				// above the search
				maxdex = avgdex;
			}
			else if (diff > 0) {
				// below the search
				mindex = avgdex;
			}
		}
		return false;
	}

	public static int stringAscending(ArrayList<String> al, String search) {
		return -1;
	}
}
