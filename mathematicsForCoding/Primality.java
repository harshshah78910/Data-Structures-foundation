package mathematicsForCoding;

public class Primality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPrime(int N)
    {
		
		if(N == 2)
			return true;
		
		for(int i=2; i<=Math.sqrt(N); i++)
		{
			if(N % i == 0)
				return false;
		}
      return true;
    }

}
