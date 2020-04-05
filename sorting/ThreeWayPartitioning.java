package sorting;

import java.util.ArrayList;

public class ThreeWayPartitioning {

	public static void main(String[] args) {

		
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}; 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i=0; i<arr.length;i++)
		{
			list1.add(arr[i]);
		}
		
		System.out.println(threeWayPartition(list1, 10,20));
	}

	// Something Similar to Dutch National FLag based QuickSort where we do three
	// partitions
	public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> list, int lowVal, int highVal) {
		
		int[] arr = new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}

		int startIndex = 0;
		int endIndex = arr.length - 1;
		int i = 0;
		while (i <= endIndex) {
			if (arr[i] < lowVal) {
				swap(arr, i, startIndex);
				startIndex++;
				i++;
			} else if (arr[i] > highVal) {
				swap(arr, i, endIndex);
				endIndex--;
			} else {
				i++;
			}

		}

		for(int i1=0;i1<list.size();i1++)
		{
			list.set(i1, arr[i1]);
		}
		return list;
	}

	private static void swap(int[] arr, int j, int i) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
