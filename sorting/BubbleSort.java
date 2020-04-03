package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7 };
		bubble(arr, 0, 4);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

	static void bubble(int arr[], int k, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}

	}

	private static void swap(int[] arr, int j, int i) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
