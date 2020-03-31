package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov) {
		for (int i = 0; i < nov; i++) 
		{
			if (!vis[i]) {
				callBFS(i, list, vis);
			}
		}
	}

	private static void callBFS(int s, ArrayList<ArrayList<Integer>> list, boolean vis[]) {

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(s);
		vis[s] = true;
		while (!queue.isEmpty()) {
			Integer node = queue.remove();
			System.out.print(node + " ");
			ArrayList<Integer> arrayList = list.get(node);
			for (int k : arrayList) {
				if (!vis[k]) {
					vis[k] = true;
					queue.add(k);
				}
			}
		}
	}

}
