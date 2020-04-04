package sorting;

import java.util.LinkedHashSet;

public class IntersectionOfArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 0, 0, 0, 0 };
		printIntersection(arr1, arr2, 0, 0);

	}

	static void printIntersection(int arr1[], int arr2[], int n, int m) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] == arr2[j]) {
				set.add(arr1[i]);
				i++;
				j++;
			}
		}

		if (set.isEmpty()) {
			System.out.print("-1");
			return;
		}

		for (int n1 : set) {
			System.out.print(n1 + " ");
		}

	}
}
