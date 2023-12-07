package Accord.J12_Part1.Question1;

import java.util.Arrays;
import java.util.Scanner;

/*
        1. Create an integer array by reading inputs in run time. Read 2 positions
            from user as input and fetch numbers from those positions. Perform
            division and display quotient and reminder. Handle necessary exceptions.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Now Enter " +size +" Values ");
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Select Any 2 position from the range 0 to " + (size-1));
        int firstPosition  = in.nextInt();
        int secondPosition = in.nextInt();

        try{
            System.out.println("The Quotient value of the selected numbers are: "+quotient(arr[firstPosition],arr[secondPosition]));
            System.out.println("The Reminder value of the selected numbers are: "+reminder(arr[firstPosition],arr[secondPosition]));
        }
        catch (Exception ignored){
            System.err.println(ignored);
        }
    }

    static float quotient(int n1,int n2){
        return (float) n1 /n2;
    }

    static int reminder(int n1,int n2){
        return n1%n2;
    }
}
