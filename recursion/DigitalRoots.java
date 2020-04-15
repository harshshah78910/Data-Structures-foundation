package recursion;

public class DigitalRoots {

	public static void main(String[] args) {


		System.out.println(digitalRoot(123));

	}

	public static int digitalRoot(int n) {
		
		int sum = sum(n);
		if(sum < 10)
		{
			return sum;
		}
		
		return digitalRoot(sum);
	}

	private static int sum(int n) {
		
		if(n==0)
			return 0;
		
		return n%10 + sum(n/10);
	}
	
	

}
