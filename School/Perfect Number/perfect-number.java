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
            Solution ob = new Solution();
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // code here
        int M=N;
        int sum=0;
        while(M>0){
            sum+=factorial(M%10);
            M/=10;
        }
        return (N==sum) ? 1 : 0;
    }
    
    int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
}