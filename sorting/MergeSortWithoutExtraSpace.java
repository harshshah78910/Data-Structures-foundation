package sorting;

public class MergeSortWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void merge(int arr1[], int arr2[], int n, int m) 
	{
		
		for(int i=m-1; i>=0; i--)
		{
			int lastElement = arr1[n-1];
			int j;
			for(j = n-2; j>=0 && arr1[j] > arr2[i]; j--)
			{
				arr1[j+1] = arr1[j];
			}
			
			if(j != n-2 || lastElement > arr2[i])
			{
				arr1[j+1] = arr2[i];
				arr2[i] = lastElement;
			}
		}
		
	}

}
