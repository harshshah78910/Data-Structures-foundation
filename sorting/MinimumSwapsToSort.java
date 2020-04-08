package sorting;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToSort {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 1 };
		System.out.println(minSwaps(arr, arr.length));

	}

	public static int minSwaps(int[] A, int N) {

		int count = 0;

		int B[] = A.clone();
		boolean[] visited = new boolean[N];

		Arrays.parallelSort(A);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			map.put(A[i], i);
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				int value = B[i];
				int correctIndex = map.get(value);
				if (i == correctIndex) // If the index of both are same then it is at correct position
				{
					continue;
				} else {
					while (!visited[correctIndex]) {
						visited[correctIndex] = true;
						int nextValueInCycle = B[correctIndex];
						correctIndex = map.get(nextValueInCycle);
						++count;
					}

				}

			}
		}

		return count;
	}

}
