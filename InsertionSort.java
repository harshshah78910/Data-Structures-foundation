

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 2, 1, 3, 5, 100, 7 };
		doInsertionSort(a);
		for (int p : a)
			System.out.print(p + " ");
	}
	
	private static void doInsertionSort(int[] arr)
	{
		for(int i=1 ; i<arr.length ; i++)
		{
			int value = arr[i];
			int holeIndex = i;
			while(holeIndex > 0 && arr[holeIndex-1] > value)
			{
				arr[holeIndex] = arr[holeIndex-1];
				holeIndex--;
			}
			arr[holeIndex] = value;
		}
	}

}
