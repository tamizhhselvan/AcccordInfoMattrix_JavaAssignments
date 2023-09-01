package Accord.J6_Part1;

public class NumberPalindrome {
    public static void main(String[] args) {
        int n=123454321;
        int temp=n;
        int ans=0;
        while (n>0){
            ans += n-((n/10)*10);
            ans*=10;
            n=n/10;
        }
        ans/=10;
        if (temp==ans) System.out.println("The given number "+temp+" is palindrome");
        else System.out.println("The given number"+temp+"is not palindrome");
    }
}
