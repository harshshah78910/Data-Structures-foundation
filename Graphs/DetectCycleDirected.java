package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDirected {

	public static void main(String[] args) 
	{
		

	}

	
	static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        boolean[] visited = new boolean[V];
        boolean[] recState = new boolean[V];
        
        for(int i=0; i<V; i++)
        {
        	if(!visited[i] && detectCycleUsingDFS(list, i, visited, recState))
        	{
        		return true;
        	}
        }
        
        return false;
    }
	
	static boolean detectCycleUsingDFS(ArrayList<ArrayList<Integer>> list, int src,boolean[] visited, boolean[] recStack )
	{
		visited[src] = true;
		recStack[src] = true;
		
		ArrayList<Integer> adjList = list.get(src);
		for(int node : adjList)
		{
			if(!visited[node])
			{
				if(detectCycleUsingDFS(list, node, visited,recStack))
				{
					return true;
				}
				
			}
			else
			{
				if(recStack[node])
				{
					return true;
				}
			}
		}
		
		recStack[src] = false;
		return false;

	}
	
	
	
	static boolean topoSort(ArrayList<ArrayList<Integer>> list, int N) //BFS Approach to solve - Kahns Algorithm
	{

		int[] inDegree = new int[N];
		
		//Calculating IN-Degree of all Vertices
		for(int i=0; i<N; i++)
		{
			ArrayList<Integer> adjList = list.get(i);
			for(int node: adjList)
			{
				inDegree[node]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int count=0;
		
		for(int i=0; i<N; i++)
		{
			if(inDegree[i] == 0)
				queue.add(i);
		}
		
		while(!queue.isEmpty())
		{
			int node = queue.remove();
			ArrayList<Integer> adjList = list.get(node);
			for(int n : adjList)
			{
				inDegree[n]--;
				if(inDegree[n] == 0)
					queue.add(n);
			}
			count++;
		}
		
		return (count != N);
		// If Count is not equal to Number of Vertices that means it contains cycle in the graph
		
	}

	
	
	
	
	
}
