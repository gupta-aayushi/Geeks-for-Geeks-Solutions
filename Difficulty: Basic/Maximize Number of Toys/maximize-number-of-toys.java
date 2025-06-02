// User function Template for Java

class Solution {
    public static int max_toys(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        int counter = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<=k) {
                k -= arr[i];
                counter++;
            }
        }
        return counter++;
    }
}