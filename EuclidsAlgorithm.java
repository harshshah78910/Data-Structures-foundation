
public class EuclidsAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gcd(105,350));
	}

	private static int gcd(int a, int b)
	{
		int dividend = a;
		int divisor = b;
		
		while(divisor != 0)
		{
			int remainder = dividend % divisor;
			dividend = divisor;
			divisor=remainder;
		}
		
		return dividend;
	}
}
