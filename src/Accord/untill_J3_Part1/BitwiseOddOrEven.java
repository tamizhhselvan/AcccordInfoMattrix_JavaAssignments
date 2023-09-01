package Accord.untill_J3_Part1;

import java.util.Scanner;

public class BitwiseOddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if ((num&1)==1) {
            System.out.println("The number is Odd");
        }
        else System.out.println("The number is not odd");
    }
}
