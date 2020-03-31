package Graphs;

import java.util.ArrayList;

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

}
