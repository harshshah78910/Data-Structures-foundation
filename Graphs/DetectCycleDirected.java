package Graphs;

import java.util.ArrayList;

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
}
