package main.java.com.gaganbelgur.dsa.graphs.shortestpaths;

import java.util.*;

public class ShortestPathSolver implements ShortestPathSolverInterface {

    // Function to perform BFS traversal
    private void bfs(int src, List<Integer>[] adj, int[] dist) {

        // Distance of source node from itself is zero
        dist[src] = 0;

        // Queue to facilitate BFS traversal
        Queue<Integer> q = new LinkedList<>();

        // Adding source node to queue
        q.add(src);

        // Until the queue is empty
        while (!q.isEmpty()) {

            // Get the node from queue
            int node = q.poll();

            // Traverse all its neighbors
            for (int adjNode : adj[node]) {

                // If a shorter distance is found
                if (dist[node] + 1 < dist[adjNode]) {

                    // Update the distance
                    dist[adjNode] = 1 + dist[node];

                    // Add the node to the queue
                    q.add(adjNode);
                }
            }
        }
    }

    /* Function to get the shortest path
    for every node from source node 0 */
    @Override
    public int[] shortestPath(int[][] edges, int N, int M) {

        // To store the graph
        List<Integer>[] adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }

        // Add edges to the graph
        for (int[] edge : edges) {
            int u = edge[0]; // first node
            int v = edge[1]; // second node

            // Add the edge
            adj[u].add(v);
            adj[v].add(u);
        }

        // Distance array to store the shortest paths
        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Start the BFS traversal from source node
        bfs(0, adj, dist);

        /* If a node is unreachable,
        updating its distance to -1 */
        for (int i = 0; i < N; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                dist[i] = -1;
        }

        // Return the result
        return dist;
    }
}
