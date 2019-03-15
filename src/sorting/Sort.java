package sorting;

public class Sort {

	public Sort() {

	}

	public static void bubbleSortAscending(int a[]) {
		for (int i = a.length; i >= 0; i--) {
			boolean flipped = false;
			for (int j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flipped = true;
				}
			}
			if (!flipped) {
				return;
			}
		}
	}

	public static void bubbleSortDescending(int a[]) {
		for (int i = a.length; i >= 0; i--) {
			boolean flipped = false;
			for (int j = 0; j < i - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flipped = true;
				}
			}
			if (!flipped) {
				return;
			}
		}
	}

	public static void selectionSortAscending(int[] numbers) {
		int min = 0;
		int temp = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[min])
					min = j;
			}
			temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;
		}
	}

	public static void selectionSortDescending(int[] numbers) {
		int max = 0;
		int temp = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			max = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] > numbers[max])
					max = j;
			}
			temp = numbers[i];
			numbers[i] = numbers[max];
			numbers[max] = temp;
		}
	}

	public static void insertionSortAscending(int[] numbers) {
		int j = 0;
		int index = 0;
		for (int i = 1; i < numbers.length; i++) {
			index = numbers[i];
			j = i;
			while ((j > 0) && (numbers[j - 1] > index)) {
				numbers[j] = numbers[j - 1];
				j = j - 1;
			}
			numbers[j] = index;
		}
	}

	public static void insertionSortDescending(int[] numbers) {
		int j = 0;
		int index = 0;
		for (int i = 1; i < numbers.length; i++) {
			index = numbers[i];
			j = i;
			while ((j > 0) && (numbers[j - 1] < index)) {
				numbers[j] = numbers[j - 1];
				j = j - 1;
			}
			numbers[j] = index;
		}
	}

	static void mergesortAscending(Number a[], int low, int high) {
		if (low == high)
			return;
		int length = high - low + 1;
		int pivot = (low + high) / 2;
		mergesortAscending(a, low, pivot);
		mergesortAscending(a, pivot + 1, high);
		Number[] working = new Number[length];
		for (int i = 0; i < length; i++)
			working[i] = a[low + i];
		int m1 = 0;
		int m2 = pivot - low + 1;
		for (int i = 0; i < length; i++) {
			if (m2 <= high - low)
				if (m1 <= pivot - low)
					if (working[m1].doubleValue() > working[m2].doubleValue())
						a[i + low] = working[m2++];
					else
						a[i + low] = working[m1++];
				else
					a[i + low] = working[m2++];
			else
				a[i + low] = working[m1++];
		}
	}

	static void mergesortDescending(Number a[], int low, int high) {
		if (low == high)
			return;
		int length = high - low + 1;
		int pivot = (low + high) / 2;
		mergesortDescending(a, low, pivot);
		mergesortDescending(a, pivot + 1, high);
		Number working[] = new Number[length];
		for (int i = 0; i < length; i++)
			working[i] = a[low + i];
		int m1 = 0;
		int m2 = pivot - low + 1;
		for (int i = 0; i < length; i++) {
			if (m2 <= high - low)
				if (m1 <= pivot - low)
					if (working[m1].doubleValue() < working[m2].doubleValue())
						a[i + low] = working[m2++];
					else
						a[i + low] = working[m1++];
				else
					a[i + low] = working[m2++];
			else
				a[i + low] = working[m1++];
		}
	}

	static <T> Number[] numberArrayConverter(T[] arr) {
		Number[] fin = new Number[arr.length];
		for (int i = 0; i < arr.length; i++) {
			fin[i] = (Number) arr[i];
		}
		return fin;
	}
}
