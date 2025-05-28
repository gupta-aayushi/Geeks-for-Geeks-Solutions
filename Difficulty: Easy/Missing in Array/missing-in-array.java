class Solution {
    int missingNum(int arr[]) {
        // code here
        int x1=0, x2=0;
        for (int i=1; i<=arr.length+1; i++){
            x2^=i;
        }
        for (int i = 0; i < arr.length; i++){
            x1^=arr[i];
        }
        return x2^x1;
    }
}