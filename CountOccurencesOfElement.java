
public class CountOccurencesOfElement {
	
	public static void main(String[] args) {
		

		int arr[] = new int[] { 1,2,3,34,34,34,200};
	    int firstIndex = doBinarySearchIterative(arr,10,true);
	    if(firstIndex == -1)
	    {
	    	System.out.println("No Elements Found ");
	    	return;
	    }
	    int lastIndex = doBinarySearchIterative(arr,10,false);
	    System.out.println("FirstIndex is at "+firstIndex + " last Index is at " +lastIndex);
	    System.out.println("Number of occurence is " +(lastIndex - firstIndex +1));
	
	}
	
	private static int doBinarySearchIterative(int[] arr, int x,boolean searchFirstElement)
	{
		int start = 0; 
		int end = arr.length-1;
		int mid = start + (end-start)/2;
		int result = -1;
		while(start <= end)
		{
			if(arr[mid] == x)
			{
				result = mid;
				if(searchFirstElement)
				{
					end = mid-1; //In case of Duplicate we want to find leftmost occurence
				}
				else
				{
					start = mid +1; // In case of Duplicate we want to find rightmost occurence
				}
			}
				
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
		return result;
	}

}
