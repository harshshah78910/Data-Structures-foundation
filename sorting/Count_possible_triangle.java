package sorting;

import java.util.Arrays;

public class Count_possible_triangle {

	public static void main(String[] args) {
		int[] arr = { 6, 4, 9, 7, 8 };
		System.out.println(findNumberOfTriangles(arr, arr.length));
	}

	static long findNumberOfTriangles(int arr[], int n) {
		Arrays.sort(arr);

		long count = 0;
		for (int i = n - 1; i >= 1; i--) {
			int r = i - 1;
			int l = 0;
			while (l < r) {
				if (arr[l] + arr[r] > arr[i]) {
					count += r - l;
					r--;
				} else {
					l++;
				}
			}
		}

		return count;
	}

}
