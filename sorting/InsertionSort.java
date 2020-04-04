package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 8, 7 };
		insert(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

	}

	static void insert(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
