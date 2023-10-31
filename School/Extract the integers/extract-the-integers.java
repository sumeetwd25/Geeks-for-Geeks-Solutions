//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution {
    ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> alist = new ArrayList<>();
        StringBuilder digitBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                digitBuilder.append(c);
            } else if (digitBuilder.length() > 0) {
                alist.add(digitBuilder.toString());
                digitBuilder.setLength(0); // Clear the StringBuilder
            }
        }
        
        // Check if there are any digits left in the StringBuilder after the loop
        if (digitBuilder.length() > 0) {
            alist.add(digitBuilder.toString());
        }

        return alist;
    }
}
