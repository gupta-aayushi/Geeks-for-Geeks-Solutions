//{ Driver Code Starts
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
            System.out.println(ob.facDigits(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution{
    static int facDigits(int n){
        if (n<4){
            return 1;
        }
        else{
            double digitCount = 0;
            for (int i = 2; i <= n; i++) {
                digitCount += Math.log10(i);
            }
            return (int) Math.floor(digitCount) + 1;
        }
    }
}
