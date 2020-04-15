package recursion;

public class FibonacciTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(20));
	}
	
	static long fibonacci(int n)
    {
        if(n == 1)
        	return 1;
        else if (n == 2)
        	return 1;
        else if (n <= 0)
        	return 0;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
