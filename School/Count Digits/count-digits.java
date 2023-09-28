//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        // code here
        String num = Integer.toString(N);
        int count=0;
        
        int y=N;
        int x=y%10;
        
        for(int i=0; i<num.length(); i++){
            if(x!=0 && N%x==0){
                count++;
            }
            y=y/10;
            x=y%10;
        }
        return count;
    }
}