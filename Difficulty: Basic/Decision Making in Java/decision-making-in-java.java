// User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if (n==m) {
            return "equal";
        }
        if (n<m) {
            return "lesser";
        }
        else {
            return "greater";
        }
    }
}