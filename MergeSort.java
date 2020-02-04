package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 2, 1, 3, 500, 100, 7 };
		doMergeSort(a);
		for (int p : a)
			System.out.print(p + " ");
	}
	
	private static void doMergeSort(int[] arr)
	{
		int length = arr.length;
		if(length ==1)
			return;
		int middle = length/2;
		int[] leftArr = new int[middle];
		int[] rightArr = new int[length-middle];
		for(int i=0; i<middle; i++)
			leftArr[i] = arr[i];
		for(int i=0; i<rightArr.length; i++)
			rightArr[i] = arr[i+middle];
		doMergeSort(leftArr);
		doMergeSort(rightArr);
		mergeArrays(leftArr,rightArr,arr);		
	}

	private static void mergeArrays(int[] leftArr, int[] rightArr, int[] arr) 
	{
		int leftArryIndexPosition=0;
		int rightArryIndexPosition=0;
		int finalArryIndexPosition =0;
		while(leftArryIndexPosition < leftArr.length && rightArryIndexPosition < rightArr.length)
		{
			if(leftArr[leftArryIndexPosition] <= rightArr[rightArryIndexPosition])
			{
				arr[finalArryIndexPosition] = leftArr[leftArryIndexPosition];
				leftArryIndexPosition++;
			}
			else 
			{
				arr[finalArryIndexPosition] = rightArr[rightArryIndexPosition];
				rightArryIndexPosition++;
			}
			finalArryIndexPosition++;
		}
		while(leftArryIndexPosition < leftArr.length)
		{
			arr[finalArryIndexPosition] = leftArr[leftArryIndexPosition];
			leftArryIndexPosition ++;
			finalArryIndexPosition++;
		}
		while(rightArryIndexPosition < rightArr.length)
		{
			arr[finalArryIndexPosition] = rightArr[rightArryIndexPosition];
			rightArryIndexPosition++;
			finalArryIndexPosition++;
		}
		
	}

}
