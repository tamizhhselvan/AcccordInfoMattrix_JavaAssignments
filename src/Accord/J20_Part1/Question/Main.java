package Accord.J20_Part1.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> stringList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("Enter your String/type exit to stop entering the values");
        while (!(input = in.nextLine()).equalsIgnoreCase("exit")) {
            stringList.add(input);
        }
        System.out.println(stringList);

        System.out.print("Enter your Target.");
        String targetName = in.next();

        int count=0;
        if (stringList.contains(targetName)){
            System.out.println("The given Word is present in the arraylist ");

            for (String str : stringList) {
                if (str.equals(targetName)) {
                    count++;
                }
            }
            System.out.println(count+" times occurred in the list");
        }
    }
}
