//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int Grid[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < N; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.diagonalSumDifference(N, Grid));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int diagonal1 = 0;
        int diagonal2 = 0;
    
        for (int i = 0; i < N; i++) {
            diagonal1 += Grid[i][i];
            diagonal2 += Grid[i][Grid.length - 1 - i];
        }
        return Math.abs(diagonal1 - diagonal2);
    }
}