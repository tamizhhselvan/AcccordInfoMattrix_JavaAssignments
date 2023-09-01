package Accord.J5_Part1;

import java.util.ArrayList;
import java.util.Scanner;


public class StringToCharArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        ArrayList<Character> ch = new ArrayList<>();
     //   char[] ch = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
                ch.add(name.charAt(i));
        }

        System.out.println(ch);
    }
}
