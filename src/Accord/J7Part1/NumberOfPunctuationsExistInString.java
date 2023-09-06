package Accord.J7Part1;

import java.util.Scanner;

public class NumberOfPunctuationsExistInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = in.nextLine();
        int uc=0;
        int lc=0;
        int pun=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                lc++;
            }
           else if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                uc++;
            }
            else pun++;
        }
        System.out.println("No of punctuations: "+pun);
    }
}
