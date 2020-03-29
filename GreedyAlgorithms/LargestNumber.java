package GreedyAlgorithms;

public class LargestNumber {

	public static void main(String[] args) {
		
		System.out.println(largestNumber(5,12));

	}
	
	
	static String largestNumber(int n, int sum)
    {
        String result = "";
        int currentSum =0;
        
        for(int i=0; i<n; i++)
        {
        	for(int j=9; j>=0 ; j--)
        	{
        		if(currentSum + j <= sum)
        		{
        			currentSum += j;
        			result += j;
        		    break;
        		}
        	}
        }
        
        if(sum != currentSum)
        {
        	return "-1";
        }
        
        return result;
        
    }

}
