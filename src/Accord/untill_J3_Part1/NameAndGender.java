package Accord.untill_J3_Part1;

import java.util.Scanner;

public class NameAndGender {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name,gender and mail ID :");
        String name = in.nextLine();
        String gender = in.nextLine();
        String mail = in.nextLine();

        System.out.println(name+ " " + gender);
        System.out.println(mail);
    }
}
