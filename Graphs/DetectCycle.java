package Graphs;

import java.util.ArrayList;

public class DetectCycle {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<4; i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		list.get(0).add(1);
		list.get(1).add(2);
		list.get(2).add(3);
		
		System.out.println(isCyclic(list, 4));

	}

	static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
		boolean[] visited = new boolean[V];
		for(int i=0; i<V; i++)
		{
			if(!visited[i] && callDFS(list,visited,i,-1) )
			{
				return true;
			}
		}
		
        return false;
    }

	private static boolean callDFS(ArrayList<ArrayList<Integer>> list, boolean visited[], int src, int parent) 
	{
		visited[src] = true;
		ArrayList<Integer> adjList = list.get(src);
		for(int node:adjList)
		{
			if(!visited[node])
			{
				if (callDFS(list, visited, node, src))
				{
					return true;
				}
			}
			else // node is already visited
			{
				if(node != parent)
				{
					return true;
				}
			}
		}
		
		return false;
	}

}
