package Accord.J6_Part1;

public class FactorialOfNumber {
    public static void main(String[] args) {
       int n= 10;
//        int ans= fact(n);
//        System.out.println(ans);
        int ans1=1;
        for (int i = n; i >= 1; i--) {
            ans1=ans1*i;
        }
        System.out.println(ans1);
    }
//// This will also give correct output when we call this function "fact()"    ////
    static int fact(int n) {
        if (n==1||n==0)
            return 1;
        else return  n * fact(n-1);
    }
}
