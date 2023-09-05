package Accord.J6_Part2;

import java.util.Arrays;

public class ArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] arr={8,9,3,6,2,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
