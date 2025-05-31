// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n = arr.size();
        int d = Integer.MAX_VALUE;
        for (int i=0; i<=n-m; i++){
            int k = arr.get(i+m-1)-arr.get(i);
            d = Math.min(k,d);
        }
        return d;
    }
}