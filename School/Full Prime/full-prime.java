//{ Driver Code Starts
//Initial Template for Java

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
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	static int fullPrime(int N){
	    //code here
	    int M=N;
	    boolean flag=true;
	    while(N>0){
	       int x = N%10;
	       if(!isPrime(x)){
	           flag=false;
	           break;
	       } 
	       N/=10;
	    }
	    
	    if(isPrime(M) && flag){
	        return 1;
	    }
	    else return 0;
	        
	       
	}
	
    static boolean isPrime(int N){
        if (N <= 1) {
            return false;
        }
        if (N <= 3) {
            return true;
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}