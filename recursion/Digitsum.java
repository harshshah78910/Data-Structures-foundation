package recursion;

public class Digitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(99));
	}
	
	
	public static int sumOfDigits(int n)
    {
        if(n == 0)
        	return 0;
        
        return n%10 + sumOfDigits(n/10);
    }

}
