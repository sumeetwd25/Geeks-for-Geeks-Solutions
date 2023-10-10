//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
        String X = Long.toString(n);
        String Y = Long.toString(n*2);
        String Z = Long.toString(n*3);
        String XYZ = X+Y+Z;
        
        if(XYZ.length()==9 && XYZ.contains("1") && XYZ.contains("2") && XYZ.contains("3") && XYZ.contains("4") && XYZ.contains("5") && XYZ.contains("6") && XYZ.contains("7") && XYZ.contains("8") && XYZ.contains("9")){
            return true;
        }
        return false;
    }
}