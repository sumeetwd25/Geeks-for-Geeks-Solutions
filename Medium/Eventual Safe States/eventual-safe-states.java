//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

//Problem Solved By |JAVA| Using Depth-First Search (DFS) Approach|
class Solution {

    // Function to find eventual safe nodes.
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Create a list to store the eventual safe nodes.
        List<Integer> safeNodes = new ArrayList<>();

        // Create an array to keep track of the state of each node:
        // 0: Not visited, 1: Visiting (in the process of exploration), 2: Safe
        int[] state = new int[V];

        // Step 1: Iterate through each node to check if it's an eventual safe node.
        for (int i = 0; i < V; i++) {
            if (isSafeNode(i, adj, state)) {
                safeNodes.add(i);
            }
        }

        // Step 2: Sort the eventual safe nodes and return them.
        Collections.sort(safeNodes);
        return safeNodes;
    }

    // Step 3: Recursive function to determine if a node is safe.
    private boolean isSafeNode(int node, List<List<Integer>> adj, int[] state) {
        // If the state is 0, the node has not been visited.
        if (state[node] != 0) {
            // If the state is 2, it's already determined to be safe.
            return state[node] == 2;
        }

        // Step 4: Mark the node as currently being visited (state 1).
        state[node] = 1;

        // Step 5: Explore neighbors of the current node.
        for (int neighbor : adj.get(node)) {
            if (!isSafeNode(neighbor, adj, state)) {
                return false;
            }
        }

        // Step 6: Mark the current node as safe (state 2).
        state[node] = 2;
        return true;
    }
}
