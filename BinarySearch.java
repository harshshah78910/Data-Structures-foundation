
public class BinarySearch {

	public static void main(String[] args) 
	{
		int arr[] = new int[] { 1,2,3,34,56,200};
	    System.out.println(doBinarySearchRec(arr,0,arr.length,23));
	    System.out.println(doBinarySearchIterative(arr,34));
	}
	
	
	private static int doBinarySearchIterative(int[] arr, int x)
	{
		int start = 0; 
		int end = arr.length-1;
		int mid = start + (end-start)/2;
		while(start <= end)
		{
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
			{
				start = start;
				end = mid -1;
			}
			else 
			{
				start = mid +1;
				end = end;
			}
			mid = start + (end-start)/2;
		}
		return -1;
	}
	
	private static int  doBinarySearchRec(int[] arr, int start, int end, int x)
	{
		if(start > end)
		{
			return -1;
		}
		int mid = start + (end-start)/2;
		if(arr[mid] == x)
		{
			return mid;
		}
		else if(arr[mid] > x)
		{
			return doBinarySearchRec(arr, start, mid-1, x);
		}
		else
		{
			return doBinarySearchRec(arr, mid+1, end, x);
		}
	}

}
