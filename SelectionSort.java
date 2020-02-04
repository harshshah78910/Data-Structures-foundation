public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 2, 1, 3, 5, 100, 7 };
		doSelectionSort(a);
		for (int p : a)
			System.out.print(p + " ");
	}

	private static void doSelectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int smallestValueIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[smallestValueIndex]) {
					smallestValueIndex = j;
				}
			}
			swapNumbers(i, smallestValueIndex, arr);
		}
	}

	private static void swapNumbers(int i, int smallestValueIndex, int[] arr) {

		int temp = arr[i];
		arr[i] = arr[smallestValueIndex];
		arr[smallestValueIndex] = temp;

	}

}
