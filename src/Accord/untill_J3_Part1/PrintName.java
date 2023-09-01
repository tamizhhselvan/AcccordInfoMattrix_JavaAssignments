package Accord.untill_J3_Part1;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your name and qualification :");
        String name = in.next();
        String EduQualification = in.nextLine();

        System.out.println("I am " +name);
        System.out.println("My Educational qualification is " + EduQualification);
    }
}
