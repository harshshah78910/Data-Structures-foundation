package sorting;

import java.util.HashSet;

public class CountDistinctElementsInWindow {

	public static void main(String[] args) {

		int arr[] = {1,2,1,3,4,2,3}; 
		countDistinct(arr,4,arr.length);
		
	}

	static void countDistinct(int arr[], int k, int n)  // It can be solved better using Hashing of Values
	{
		
		for(int i=0; i<=n-k; i++)
		{
			HashSet<Integer> set = new HashSet<Integer>();
			int limit = i+k;
			if(limit <= n)
			{
				for(int j=i; j<limit; j++ )
				{
					set.add(arr[j]);
				}
				System.out.print(set.size() + " ");
			}
		
		}
		
		
	}

}
