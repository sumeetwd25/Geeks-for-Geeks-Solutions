//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_AutomorphicNumber(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        // Code here
        int last_digit = n % 10;
        
        int square = (int) Math.pow(n, 2);
        int square_last_digit = square % 10;
        
        if (square_last_digit == last_digit) return "Automorphic";
        else return "Not Automorphic";
    }
}