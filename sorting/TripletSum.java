package sorting;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) 
	{
		int[] arr = {1 ,2 ,4, 3, 6};
		System.out.println(find3Numbers(arr, arr.length, 100));
	}

	// Based on Three way partitioning technique
	
	public static int find3Numbers(int arr[], int n, int x) {

		
		Arrays.parallelSort(arr);
		
		for(int i=0; i<n-1; i++)
		{
			int fixValue = arr[i];
			int right = n-1;
			int left = i+1;
			while(left < right)
			{
				if(fixValue + arr[left] + arr[right] == x)
				{
					return 1;
				}
				else if(fixValue + arr[left] + arr[right] > x)
				{
					right--;
				}
				else if(fixValue + arr[left] + arr[right] < x)
				{
					left++;
				}
			}
		}
		
		
		return 0;
	}

}
