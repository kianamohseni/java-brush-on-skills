package Graphs;

import java.util.LinkedList;
import java.util.Iterator;

public class Graph {
	private LinkedList<Integer> graph[];
	private Integer vertices;
	
	public Graph(int v) {
		vertices = v;
		graph = new LinkedList[v];
		for (int i=0; i < vertices; i++) {
			graph[i] = new LinkedList();
		}

	}
	public void addEdge(int v, int to) {
		System.out.println("v,to: " + v + to);
		graph[v].add(to);
	}
	public void printMe() {
		System.out.println("printme");
		for (int i=0; i< vertices; i++) {

			System.out.print("[");
			int size = graph[i].size();
//			System.out.println(size);
			for (int k=0; k<size; k++) {
				System.out.print(graph[i].get(k));
			}
			System.out.println("]");
		
		}
	}
	public void BFS(int i) {
		boolean visited[] = new boolean[vertices];
		
		LinkedList<Integer> queue = new LinkedList();
		System.out.print("starting at: " + i + " ");
		visited[i] = true;
		queue.add(i);
		
		while(!queue.isEmpty()) {
			int z = queue.poll();
			Iterator<Integer> m = graph[z].listIterator();
			while (m.hasNext()) {
				int n = m.next();
				if (!visited[n]) {
					visited[n]=true;
					System.out.print(n + " ");
					queue.add(n);
				}
			}
		}
		
		
	}

}
