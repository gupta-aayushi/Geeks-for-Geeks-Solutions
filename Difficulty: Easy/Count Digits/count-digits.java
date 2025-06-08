class Solution {
    public int countDigits(int n) {
        // code here
        int b = 0;
        while (n>0){
            n/=10;
            b++;
        }
        return b;
    }
}
