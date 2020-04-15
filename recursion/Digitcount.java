package recursion;

public class Digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countDigits(10000));
	}
	
	 public static int countDigits(int n)
	    {
	        if(n == 0)
	        	return 0;
	        
	        return 1+countDigits(n/10);
	    }

}
