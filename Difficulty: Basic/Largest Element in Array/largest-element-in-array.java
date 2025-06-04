class Solution {
    public static int largest(int[] arr) {
        // code here
        int m = Integer.MIN_VALUE;
        for (int i: arr){
            if (i>m) m=i;
        }
        return m;
    }
}
