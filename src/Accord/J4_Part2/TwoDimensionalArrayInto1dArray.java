package Accord.J4_Part2;

import java.util.ArrayList;

public class TwoDimensionalArrayInto1dArray {
    public static void main(String[] args) {
        int[][] arr={{17,48,91},
                {40,51,62},
                {19,82,73}};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    list.add(arr[i][j]);
            }
        }
        System.out.println(list);
    }
}
