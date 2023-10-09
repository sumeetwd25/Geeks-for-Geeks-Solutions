//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
        // code here
        String arr[] = s.split(" ");
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i].substring(0,1).toUpperCase().concat(arr[i].substring(1,arr[i].length()));
        }
        String ucase = String.join(" ", arr);
        return ucase;
    }
}