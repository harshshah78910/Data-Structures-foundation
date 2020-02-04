package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 12, 2, 3, 45, 654, 3 };
		doBubbleSort(arr);
		for (int p : arr)
			System.out.print(p + " ");
	}

	private static void doBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j] > arr[j + 1])
					swap(j, j + 1, arr);
			}
		}
	}

	private static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
