//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s1 = br.readLine().trim();
            String[] s2 = s1.split(" ");
            int a = Integer.parseInt(s2[0]);
            int r = Integer.parseInt(s2[1]);
            int n = Integer.parseInt(s2[2]);
            Solution ob = new Solution();
            int ans = ob.Nth_term(a, r, n);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
    public int Nth_term(int a, int r, int n)
    {
        int mod = 1000000007; 
        long result = a; 
        for (int i = 1; i < n; i++) {
            result = (result * r) % mod; 
        }
        return (int) result;
    }
}