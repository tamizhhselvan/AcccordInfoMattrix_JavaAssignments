package Accord.J4_Part1;

import java.util.Scanner;

public class Getting10InputFromUser {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of the numbers ");
//        int size=in.nextInt();
//
//        int [] arr = new int[size];
//        System.out.print("Enter the numbers: ");
//        for (int i = 0; i < size; i++) {
//            arr[i]=in.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            if ((arr[i]&1)==0){
//                System.out.print(arr[i]+" ");
//            }
//        }

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr= new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]= in.nextInt();
        }

        for (int i = 4; i >=0; i--) {
            System.out.println(arr[i]);
        }

    }
}
