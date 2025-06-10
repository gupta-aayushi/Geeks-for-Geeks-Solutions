// User function Template for Java
class Solution {

    public static int find_greatest_number(int a, int b, int c) {
        // Write your code here..
        if (a>=b && a>=c) return a;
        if (b>=a && b>=c) return b;
        return c;
    }
}