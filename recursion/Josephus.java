package recursion;

public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(josephus(7, 3));
	}
	
	public static int josephus(int n, int k)
    {
       if(n==1)
    	   return n;
       
       return (josephus(n-1,k) + k -1) % n +1;
    }

}
