import java.util.*;

public class GraphDFS {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    @SuppressWarnings("unchecked") GraphDFS(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        Iterator<Integer> iterator = adj[vertex].listIterator();
        while(iterator.hasNext()) {
            int adj = iterator.next();
            if (!visited[adj]) {
                DFS(adj);
            }
        }
    }
}
