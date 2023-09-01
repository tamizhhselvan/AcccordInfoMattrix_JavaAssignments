package Accord.J3_Part2;

public class SplittingNumbers {
    public static void main(String[] args) {
        int n = 789;

        int ans=0;
        while (n>0){

            ans = n%10;

            System.out.println(ans);
            n=n/10;

        }
    }
}
