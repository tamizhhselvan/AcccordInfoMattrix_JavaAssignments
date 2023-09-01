package Accord.untill_J3_Part1;

import java.util.Scanner;

public class LoanSanctioning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        if (age > 20) {
            System.out.print("Enter your salary: ");
            int salary = in.nextInt();

            if (salary>25000) System.out.println("Your loan sanctioned ");

            else System.out.println("Your loan application is rejected because of your salary .");
        }

        else System.out.println("Your loan application is rejected because your age is low.");

    }
}
