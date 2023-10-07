package Accord.J8_Part2.Question2;
/*
        2. Create a class named Welcome. Write constructors, to display a welcome
            message. Create 2 constructors. One to read username as input and tell
            welcome with name. Another default constructor to print Welcome
            Guest.

 */

import java.util.Scanner;

class Welcome{
    String guestName ="Guest";

     Welcome() {
        System.out.println("Welcome" + guestName);
    }

    Welcome(String guestName){
        System.out.println("Welcome "+ guestName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Welcome obj = new Welcome();
        System.out.print("Enter your guest name: ");
        String guestName= in.nextLine();
        Welcome obj2 = new Welcome(guestName);
    }
}
