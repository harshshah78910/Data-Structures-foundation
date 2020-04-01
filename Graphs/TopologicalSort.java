package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

	public static void main(String[] args) {
		

		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<6; i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		list.get(0).add(5);
		list.get(1).add(3);
		list.get(2).add(3);
		list.get(4).add(0);
		list.get(4).add(1);
		list.get(5).add(2);
		
		int[] topoSort = topoSort(list, 6);
		
		for(int i: topoSort)
		{
			System.out.print(i +" ");
		}
		

	

	}

	static int[] topoSort(ArrayList<ArrayList<Integer>> list, int N) {

		int[] inDegree = new int[N];
		
		for(int i=0; i<N; i++)
		{
			ArrayList<Integer> adjList = list.get(i);
			for(int node: adjList)
			{
				inDegree[node]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] result = new int[N];
		int index=0;
		
		for(int i=0; i<N; i++)
		{
			if(inDegree[i] == 0)
				queue.add(i);
		}
		
		while(!queue.isEmpty())
		{
			int node = queue.remove();
			result[index] = node;
			index++;
			ArrayList<Integer> adjList = list.get(node);
			for(int n : adjList)
			{
				inDegree[n]--;
				if(inDegree[n] == 0)
					queue.add(n);
			}
			
		}
		
		
		return result;
		
	}

}
