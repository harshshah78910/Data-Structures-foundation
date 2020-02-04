package Sorting;

public class QuickSort {

	public static void main(String[] args) 
	{
		int[] a = new int[] { 2, 100, 3, 500, 100, 7, 9 };
		doQuickSort(a, 0, a.length-1);
		for (int p : a)
			System.out.print(p + " ");	
	}

	private static void doQuickSort(int[] arr, int startIndex, int endIndex)
	{
		if(startIndex < endIndex)
		{
			int partitionIndex = doPartitioning(arr,startIndex,endIndex);
			doQuickSort(arr, startIndex, partitionIndex-1);
			doQuickSort(arr, partitionIndex+1, endIndex);
		}
		
		
	}

	private static int doPartitioning(int[] arr, int startIndex, int endIndex) {
		
		int pivotValue = arr[endIndex];
		int partitioningIndex = startIndex;
		for(int i=startIndex; i<endIndex; i++)
		{
			if(arr[i] <= pivotValue)
			{
				swap(arr,i,partitioningIndex);
				partitioningIndex++;
			}
		}
		swap(arr,endIndex,partitioningIndex);
		return partitioningIndex;
	}

	private static void swap(int[] arr, int i, int partitioningIndex) 
	{
		int temp = arr[i];
		arr[i]=arr[partitioningIndex];
		arr[partitioningIndex] = temp;
	}
	
}
