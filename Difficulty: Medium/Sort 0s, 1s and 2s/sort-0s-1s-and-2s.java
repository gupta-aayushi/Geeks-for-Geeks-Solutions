class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0) c0++;
            else if (arr[i]==1) c1++;
            else if (arr[i]==2) c2++;
        }
        for (int i = 0; i<c0; i++) arr[i] = 0;
        for (int i = c0; i<c0 + c1; i++) arr[i] = 1;
        for (int i = c0 + c1; i<arr.length; i++) arr[i] = 2;
        
    }
}