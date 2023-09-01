package Accord.untill_J3_Part1;

import java.util.Scanner;

public class SimpleInterestCalculating {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        // SI= p*n*r/100
        System.out.print("Enter the principle amount :");
        int principle = in.nextInt();
        System.out.print("Enter the number of months :");
        int noOfMonths = in.nextInt();
        System.out.print("Rate of interest :");
        int rateOfInterest = in.nextInt();

        int simpleInterest = (principle*noOfMonths*rateOfInterest)/100;

        System.out.println("The simple interest is  " + simpleInterest);
    }
}
