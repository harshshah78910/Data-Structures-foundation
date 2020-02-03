
public class FibWithMemorization {

	public static void main(String[] args) {
		
		int fib = 7;
		int[] arr = new int[fib];
		arr[0]=0;
		arr[1]=1;
		
		System.out.println(findFib(fib-1, arr));
	}
	
	private static int findFib(int fib, int[] arr)
	{
		if(fib <= 1)
			return fib;
		if(arr[fib] != 0)
			return arr[fib];
		else
		{
			int value = findFib(fib-1,arr) + findFib(fib-2,arr);
			arr[fib] = value;
			return value;
		}
		
	}

}
