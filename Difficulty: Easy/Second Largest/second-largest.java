class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int a = arr[0];
        int b = -1;
        for (int i : arr){
            if (i>a){
                b = a;
                a = i;
            }
            else if (i>b && a>i){
                b = i;
            }
        }
        return b;
    }
}