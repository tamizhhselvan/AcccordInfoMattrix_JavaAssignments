package Accord.J12_Part1.Question3;

/*
        3. Find Simple interest,by reading principal amount, number of years and
            rate of interest as input. Handle necessary exceptions.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter the principal amount");
            int principal = in.nextInt();
            System.out.print("Enter the Number of years");
            int years = in.nextInt();
            System.out.print("Enter the Rate of interest");
            float rateOfInterest = in.nextFloat();

            double simpleInterest = (principal*years*rateOfInterest)/100;
            System.out.print("The SimpleInterest is "+ simpleInterest);
        }
        catch (NumberFormatException e ){
            System.out.println("Error: Please enter valid integers.");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
