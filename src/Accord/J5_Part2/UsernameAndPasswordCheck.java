package Accord.J5_Part2;

import java.util.Scanner;

public class UsernameAndPasswordCheck {
    public static void main(String[] args) {
        String username="tamil";
        String password="Selvan@369";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your username:");
        String iName = in.next();
        System.out.print("Enter your password:");
        String pWord = in.next();
        System.out.println();
        if ( username.equals(iName) && password.equals(pWord) ){
            System.out.println("log in success");
        }
        else System.out.println("log in failed");
    }
}
