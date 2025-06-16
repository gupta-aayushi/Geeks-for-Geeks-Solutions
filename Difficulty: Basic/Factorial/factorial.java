// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        // Write your code here
        if (n==1||n==0) return 1;
        int arr[] = new int[n+1];
        arr[1] = 1;
        for (int i=2; i<=n; i++){
            arr[i] = i*arr[i-1];
        }
        return arr[n];
    }
}