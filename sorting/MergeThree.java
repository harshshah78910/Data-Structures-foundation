package sorting;

import java.util.ArrayList;

public class MergeThree {

	public static void main(String[] args) 
	{
	  int[] A = {1,2 ,3, 4};
	  int[] B = {1 ,2, 3, 4};
	  int[] C = {1,2, 3, 4, 5, 6};
 
	  ArrayList<Integer> merge3sorted = merge3sorted(A,B,C);
	  
	  for(int value : merge3sorted)
	  {
		  System.out.print(value + " ");
	  }
	}

	static ArrayList<Integer> merge3sorted(int A[], int B[], int C[]) {
		
		int i=0;
		int j=0;
		int k=0;
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(i < A.length && j < B.length && k<C.length)
		{
			if(A[i] <= B[j] && A[i] <= C[k])
			{
				result.add(A[i]);
				i++;
			}
			else if(B[j] <= A[i] && B[j] <= C[k])
			{
				result.add(B[j]);
				j++;
			}
			else 
			{
				result.add(C[k]);
				k++;
			}
		}
		
		if(i >= A.length) // A gets Exhausted First Then
		{
			mergeTwoArray(result, B, j, C,k);
		}
		else if(j >= B.length) // B gets exhausted First
		{
			mergeTwoArray(result, A, i, C,k);
		}
		else
		{
			mergeTwoArray(result, A, i, B,j);
		}
		
		return result;
		
	}
	
	static void mergeTwoArray(ArrayList<Integer> result, int[] A, int aIndex, int[] B, int bIndex)
	{
		while(aIndex < A.length && bIndex < B.length)
		{
			if(A[aIndex] <= B[bIndex])
			{
				result.add(A[aIndex]);
				aIndex++;
			}
			else
			{
				result.add(B[bIndex]);
				bIndex++;
			}
		}
		
		while(aIndex < A.length )
		{
			result.add(A[aIndex]);
			aIndex++;
		}
		
		while(bIndex < B.length)
		{
			result.add(B[bIndex]);
			bIndex++;
		}
	}
	

}
