package Accord.J3_Part2;

import java.util.Scanner;

public class Input0Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the input ");

        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]= in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if ((arr[i]&1)==1) System.out.println(arr[i]);
        }
    }
}
