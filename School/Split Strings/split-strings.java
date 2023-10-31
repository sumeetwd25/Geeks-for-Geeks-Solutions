//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        String s1="", s2="", s3="";
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(c>=65 && c<=90 || c>=97 && c<=122) s1+=c;
            else if(c>=48 && c<=57) s2+=c;
            else s3+=c;
        }
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }
} 
