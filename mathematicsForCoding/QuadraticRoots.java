package mathematicsForCoding;

public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void quadraticRoots(int a, int b, int c) 
	{
		double d = Math.pow(b, 2) - 4*a*c;
		
		if(d >= 0)
		{
			int root1 = (int) ((-b + Math.sqrt(d))/2*a);
			int root2 = (int) ((-b - Math.sqrt(d))/2*a);
			if(root1 >= root2)
			System.out.print(root1 + " " +root2);
			else
				System.out.print(root2 + " " +root1);
		}
		else
		{
			System.out.print("Imaginary");
		}
		
	}

}
