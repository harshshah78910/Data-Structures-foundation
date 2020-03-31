package Graphs;

import java.util.ArrayList;

public class PrintingAdjacencyList {

	public static void main(String[] args) {
		

	}
	
	static void printAdjacencyList(ArrayList<ArrayList<Integer>> list, int v)
	{
	    for(int i=0; i<v; i++)
	    {
	    	ArrayList<Integer> arrayList = list.get(i);
	    	System.out.print(i);
	    	for(int j : arrayList)
	    	{
	    		System.out.print("-> "+j);
	    	}
	    	System.out.println();
	    }
	}

}
