import java.util.Arrays;

public class SieveAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n = 20;
          printPrimeNumbersUptoN(n);
	}

	private static void printPrimeNumbersUptoN(int n) {

		int[] arry = new int[n + 1];
		Arrays.fill(arry, 1);
		arry[0] = 0;
		arry[1] = 0;
		
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(arry[i] == 1)
			{
				strikeOffTheFactors(n, arry, i);
			}
		}
		
		printPrimeNumbers(n, arry);

	}

	private static void printPrimeNumbers(int n, int[] arry) {
		for(int i=2 ; i<n+1; i++)
		{
		    if(arry[i]==1)
		    	System.out.print(i + " ");
		}
	}

	private static void strikeOffTheFactors(int n, int[] arry, int i) {
		for(int j=2; j*i<=n ; j++)
		{
			arry[i*j] = 0;
		}
	}

}
