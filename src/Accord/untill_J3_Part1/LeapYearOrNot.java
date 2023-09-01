package Accord.untill_J3_Part1;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year:");
        int year = in.nextInt();

        if(year%4==0) System.out.println("This is leap year");
        else System.out.println("This is not leap year");
    }
}
