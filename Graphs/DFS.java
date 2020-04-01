package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {

	public static void main(String[] args) {
		

	}
	
	static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
       for(int i=0; i<vis.length; i++)
       {
    	   if(!vis[i])
    	   {
    		   dfsRec(i, list, vis);
    	   }
       }
    }
	
	static void dfsRec(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
	{
		  vis[src] = true;
		  ArrayList<Integer> adjNodes = list.get(src);
		  System.out.print(src + " ");
		  for(int node : adjNodes)
		  {
			  if(!vis[node])
			  {
				  vis[node] = true;			  
				  dfsRec(node, list, vis);
			  }
		  }
	}
	
	static void stackImplDFS(int src,ArrayList<ArrayList<Integer>> list,  boolean vis[] )
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(src);
		vis[src] = true;
		
		while(!stack.isEmpty())
		{
			int currentNode = stack.pop();
			System.out.print(currentNode +" ");
			vis[currentNode] = true;
			ArrayList<Integer> adjList = list.get(currentNode);
			for(int node : adjList)
			{
				if(!vis[node])
				{
					stack.push(node);
				}
			}
		}
		
	}

}
