package sorting;

public class Sort012 {

	public static void main(String[] args) {
		
		int[] arr = {1,1,1,2,2,2,0};
		segragate012(arr,arr.length);
	}

	public static void segragate012(int arr[], int n) 
	{

		// Based on Three way Partitioning technique
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int i = 0;
		while (i <= endIndex) {
			if (arr[i] == 0) {
				swap(arr, i, startIndex);
				startIndex++;
				i++;
			} else if (arr[i] == 2) {
				swap(arr, i, endIndex);
				endIndex--;
			} else {
				i++;
			}

		}
		
		for(int n1 : arr)
		{
			System.out.print(n1 +" ");
		}

	}

	
	private static void swap(int[] arr, int j, int i) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
