package Accord.J5_Part1;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        System.out.println("Enter the strings that need to be sorted:");
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i]=in.next();
        }

       // String[] names = {"Tamil","Akash","Regies","Ragu","Badri"};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j+1])>0){
                    String temp = names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.deepToString(names));
    }
}
