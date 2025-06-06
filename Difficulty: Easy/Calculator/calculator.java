// User function Template for Java
class Solution {
    public static void utility(int a, int b, int operator) {

        // write your code here
        int k = 0;
        if (operator<4 && operator>0){
        if (operator==1) k=a+b;
        if (operator==2) k=a-b;
        if (operator==3) k=a*b;
        System.out.print(k);}
        else {
            System.out.print("Invalid Input");
        }
    }
}