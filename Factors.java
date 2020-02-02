import java.util.ArrayList;
import java.util.List;

public class Factors {
	
	public static void main(String[] args) {
		
		int n = 36;
		
		new Factors().findFactors(n);
	}

	private void findFactors(int n)
	{
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<Math.sqrt(n);i++)
		{
			if(n % i ==0)
			{
				list.add(i);
				if(n/i != i)
					list.add(n/i);
			}
		}
		
		printList(list);
	}
	
	private void printList(List<Integer> list) {
		
		list.forEach((n) -> System.out.print(n + " "));
		
	}

	
	
}
