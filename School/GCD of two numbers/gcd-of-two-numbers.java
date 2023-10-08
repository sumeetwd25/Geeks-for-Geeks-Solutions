//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int A = sc.nextInt();
                    int B = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(A,B));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        if(A==B) return A;
        int diff = Math.abs(A-B);
        if(A>B) A=diff;
        else B=diff;
        return gcd(A,B);
    } 
}