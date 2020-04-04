package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		

		int[] arr = { 4,1,3,9,7 };
		quickSort(arr, 0, 4);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

	
	}
	
	static void quickSort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex-1);
			quickSort(arr, partitionIndex+1, high);
		}
	}
	
	
	static int partition(int arr[], int low, int high)
	{
		int i=low-1;
		int pivot = arr[high];
		for(int j=low;j<high;j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	
	private static void swap(int[] arr, int j, int i) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
