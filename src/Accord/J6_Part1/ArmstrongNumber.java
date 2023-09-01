package Accord.J6_Part1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=1634;
        int temp=n;
        int pow=0;
        int ans=0;

        while (n>0){
            n=n/10;
            pow++;
        }
       // System.out.println(count);
        n=1634;
        while (n>0){
            ans+=Math.pow((n%10),pow);
            n=n/10;
        }
        System.out.println(ans);
        if (temp==ans){
            System.out.println("It is armstrong number");
        }
        else System.out.println("It is not armstrong number");

    }
}
