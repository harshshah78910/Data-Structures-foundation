package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class SortByAbsoluteDifference {

	public static void main(String[] args) {
		
		int arr[] = {10,5,3,9,2};
		sortABS(arr, arr.length, 7);
		
	}

	static void sortABS(int arr[], int n, int k) 
	{
		TreeMap<Integer, ArrayList<Integer>> outerMap = new TreeMap<>();
				
		for(int i=0; i<n; i++)
		{
			int differenceKey = Math.abs(arr[i]-k);
			if(outerMap.get(differenceKey) != null)
			{
				ArrayList<Integer> innerArrayList = outerMap.get(differenceKey);
				innerArrayList.add(arr[i]);
			}
			else
			{
				ArrayList<Integer> innerArrayList = new ArrayList<Integer>();
				innerArrayList.add(arr[i]);
				outerMap.put(differenceKey, innerArrayList);
			}
		}
		
	
		for(int key : outerMap.keySet())
		{
			ArrayList<Integer> innerArrayList = outerMap.get(key);
			if(innerArrayList.size()>1)
			{
				Collections.sort(innerArrayList);
				for(int elements : innerArrayList)
				{
					System.out.print(elements + " ");
				}
			}
			else
			{
				for(int elements : innerArrayList)
				{
					System.out.print(elements + " ");
				}
			}
		}
		
		
	}

}
