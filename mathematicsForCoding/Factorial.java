package mathematicsForCoding;

public class Factorial {

	public static void main(String[] args) {
		

		System.out.println((int)(Math.floor(digitsInFactorial(5)) + 1));
		
	}
	
	public long factorial (int N)
    {
		if(N ==0 )
		{
			return 1;
		}
        return N * factorial(N-1);
    }
	
	
	
	 public static double digitsInFactorial(int N) //Can Find Digits in factorial with large Numbers
	    {
		 
		 if(N == 0)
			 return 0;
		 
		 return Math.log10(N) + digitsInFactorial(N-1);
		 
	    }

	


}
