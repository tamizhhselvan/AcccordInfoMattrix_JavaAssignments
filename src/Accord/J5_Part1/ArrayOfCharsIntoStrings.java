package Accord.J5_Part1;

public class ArrayOfCharsIntoStrings {
    public static void main(String[] args) {
        char[] ch = {'t','a','m','i','l'};

        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();

        String str = new String(ch);
        System.out.println(str);
       // System.out.println(ch.toString()); ------> this won't print the actual value.
    }
}
