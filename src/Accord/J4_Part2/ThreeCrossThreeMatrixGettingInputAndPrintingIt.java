package Accord.J4_Part2;

import java.util.Scanner;

public class ThreeCrossThreeMatrixGettingInputAndPrintingIt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size= in.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i <size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j]=in.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
