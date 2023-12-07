package Accord.J12_Part1.Question2;

import java.util.Scanner;

/*
        2. Get two integers from the user using Console Class and convert it into
            integer and perform division operation. Handle necessary Exceptions.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            String input1 = in.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("Enter the second integer: ");
            String input2 = in.nextLine();
            int num2 = Integer.parseInt(input2);

            System.out.print(division(num1,num2));
        }
        catch (Exception e){
            System.err.println(e);
        }
    }

    private static int division(int num1, int num2) {
        return num2/num1;
    }
}
