package Accord.untill_J3_Part1;

import java.util.Scanner;

public class FindingLargestThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1>num2 && num1>num3) System.out.println(num1 + " is greater");
        else if (num2>num1 && num2>num3) {
            System.out.println(num2 +" is greater");
        } else if (num3>num1 && num3>num2) {
            System.out.println(num3 + " is greater");
        }
        else System.out.println("Any of the  number occurring twice ");
    }
}
