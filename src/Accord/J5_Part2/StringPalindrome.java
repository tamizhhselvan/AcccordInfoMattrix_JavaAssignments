package Accord.J5_Part2;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word:");
        String a=in.next();
        String s=a.toLowerCase();
        int i=0;
        int j = s.length()-1;
        while(i<=j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else break;
        }
        if (i>j){
            System.out.println(s+" is palindrome");
        }
        else System.out.println("It is not palindrome");

    }
}
