package Accord.untill_J3_Part1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter the radius of the circle :");
        int radius = in.nextInt();

        double area = pi*radius*radius;

        System.out.println(" The area of the circle is :"+ area);
    }
}
