package sorting;

import java.util.LinkedHashSet;

public class UnionOfSortedArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,1,2,3,4,5};
		int[] arr2 = {0,0,0,0,0};
		findUnion(arr1,arr2, 0,0);
		
	}

	
	static void findUnion(int arr1[], int arr2[], int n, int m)
    {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		int i=0;
		int j =0;
		
		
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				set.add(arr1[i]);
				i++;
			}
			else
			{
				set.add(arr2[j]);
				j++;
			}
		}
		
		while(i < arr1.length)
		{
			set.add(arr1[i++]);
		}
		
		while(j < arr2.length)
		{
			set.add(arr2[j++]);
		}
		
		
		for(int n1 : set)
		{
			System.out.print(n1 + " ");
		}
		
        
    }
}
