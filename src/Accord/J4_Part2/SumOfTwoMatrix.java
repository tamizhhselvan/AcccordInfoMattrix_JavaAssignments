package Accord.J4_Part2;

import java.util.Arrays;

public class SumOfTwoMatrix {
    public static void main(String[] args) {
        int [][] arr1={{1,2,3},
                       {4,5,6},
                       {7,8,9}
        };
        int [][] arr2={{17,48,91},
                {40,51,62},
                {19,82,73}
        };
        int [][] arr3 =new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }

        }

        System.out.println(Arrays.deepToString(arr3));
    }
}
