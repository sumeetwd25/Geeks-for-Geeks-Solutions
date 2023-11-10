//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        StringBuffer ans= new StringBuffer();
        int cnt=2;
        int pos=0;
        ans.append('1');
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='I'){
                ans.append(cnt);
                cnt++;
                pos=ans.length()-1;
            }
            else{
                ans.insert(pos,cnt);
                cnt++;
            }
        }
        return ans.toString();
    }
}
