package sorting;

import java.util.Arrays;

public class BinarySorting {

	public static void main(String[] args) 
	{

		int[] arr = { 1,1,1,0 };
		binSort(arr, 4);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

	

	}
	
	//1 Simple Technique is to count the number of 1's and 0's and place then
	//if we are allowed only one traversal to compute and print then ?? --> Using partition Function technique
	
	static void binSort(int arr[], int n)
    {
		int indexPosition = -1;
		for(int i=0; i<n ;i++)
		{
			if(arr[i] == 0)
			{
				indexPosition++;
				swap(arr,indexPosition,i);
			}
		}
		
		
    }
	
	private static void swap(int[] arr, int j, int i) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}


}
