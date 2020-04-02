package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNodes {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < 8; i++) {
			list.add(new ArrayList<Integer>());
		}

		list.get(0).add(1);
		list.get(0).add(2);
		list.get(1).add(3);
		list.get(1).add(4);
		list.get(1).add(5);
		list.get(2).add(6);
		list.get(6).add(7);

		System.out.println(levels(list, 0, 7));

	}

	static int levels(ArrayList<ArrayList<Integer>> list, int src, int destVertex) // Basically we uses BFS property of
																					// Traversal
	{
		int level = 1;
		int N = list.size();
		boolean[] visited = new boolean[N];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(src);
		queue.add(-1); // We are using to mark -1 as finish of one level in graph
		while (!queue.isEmpty()) {
			int node = queue.remove();
			if (node == -1) {
				level++;
				queue.add(-1);
				continue;
			}
			visited[node] = true;
			ArrayList<Integer> adjNodes = list.get(node);
			for (int n : adjNodes) {
				if (!visited[n]) {
					queue.add(n);
					visited[n] = true;
					if (n == destVertex) {
						return level++;
					}
				}
			}
		}

		return level;
	}

}
