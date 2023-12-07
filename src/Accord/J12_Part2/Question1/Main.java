package Accord.J12_Part2.Question1;

import java.util.Scanner;

/*
        1. Loan Eligible Checking using Throw keyword
             Location should be Chennai, Mumbai, Delhi And Kolkata. If any
            other city, raise Invalid location Error.
             Age should be minimum 23. If age is less than 23 Raise Invalid
            Age Error
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Please Enter your location: ");
            String location = in.nextLine();
            System.out.print("Please Enter your age: ");
            int age = in.nextInt();
            checkEligibility(location,age);
        }
        catch (IllegalArgumentException e){
            System.out.println("Loan Eligibility Check is FAILED"+e.getMessage());
        }

    }

    static void checkEligibility(String location,int age){

        if (!isValidLocation(location)){
            throw new IllegalArgumentException("Invalid location. The Loans We are providing to the Following cities Chennai,Mumbai,Delhi And Kolkata");
        }
        if (age < 23) {
            throw new IllegalArgumentException("Invalid age. Age should be minimum 23 for loan eligibility.");
        }
        System.out.println("Congratulations! You are eligible for the loan.");
    }

    private static boolean isValidLocation(String location) {
        return location.equalsIgnoreCase("Chennai")
                || location.equalsIgnoreCase("Mumbai")
                || location.equalsIgnoreCase("Delhi")
                || location.equalsIgnoreCase("Kolkata");
    }
}
