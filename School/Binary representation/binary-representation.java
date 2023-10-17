//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getBinaryRep(int N){
        // code here
        String binaryString = Integer.toBinaryString(N);
        String s1 = "";
        
        for(int i=0; i<30-binaryString.length(); i++){
            s1 += "0";
        }
        String s2 = s1 + binaryString;
        return s2;
    }
}