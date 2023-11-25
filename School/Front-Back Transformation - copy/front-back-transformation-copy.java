//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String s) 
    { 
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            if(ascii >= 65 && ascii <= 90) {
                ascii = s.charAt(i) - 65;
                str.append((char) (90 - ascii));    
            }
            else {
                ascii = s.charAt(i) - 97;
                str.append((char) (122 - ascii));    
            }
        }
        return str.toString();
    }
} 