//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long isSumPalindrome(long n){
        // code here
        long iteration=1;
        long reverse = Long.parseLong(new StringBuilder(Long.toString(n)).reverse().toString());
        if(n==reverse) return n;
        long sum = n + reverse;
        long reverseSum = Long.parseLong(new StringBuilder(Long.toString(sum)).reverse().toString());
        if(sum==reverseSum) return sum;
        return function(sum, ++iteration);
    }
    static long function(long n, long iteration){
        if(iteration>5) return -1;
        long reverse = Long.parseLong(new StringBuilder(Long.toString(n)).reverse().toString());
        long sum = n + reverse;
        long reverseSum = Long.parseLong(new StringBuilder(Long.toString(sum)).reverse().toString());
        if(sum==reverseSum) return sum;
        return function(sum, ++iteration);
    }
}