
public class SortedArrayRotation {

	public static void main(String[] args) {

		int arr[] = new int[] {6,7,1,2,3,4,5};
	    System.out.println(findPivotPointBS(arr));

	}
	
	private static int findPivotPointBS(int[] arr)
	{
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end)
		{
			if(arr[start] <= arr[end])
			{
				return start;
			}
			int mid = start + (end-start)/2;
			if( arr[mid] <= arr[(mid+1) % arr.length] && arr[mid] <= arr[(mid+arr.length-1) % arr.length])
			{
			    return mid;	
			}
			else if(arr[mid] <= arr[end])
			{
				start = start;
				end = mid -1;
			}
			else if(arr[mid] >= arr[start])
			{
				start = mid +1;
				end = end;
			}
		}
		
		return -1;
	}

}
