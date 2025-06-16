class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        double sum = 0;
        double cntr = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>=0){
                sum += arr[i];
                cntr++;
            }
        }
        return (double)sum/cntr;
    }
}
