package Accord.J6_Part2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicatesInTheArray {
    public static void main(String[] args) {
        int [] arr={2,3,6,2,5,6};
        ArrayList<Integer> a1= new ArrayList<>();
       // int k=0;
       // int count=0;              ---> this wont work because count value will get increased
                        // from 19th line,but we need to reset when the loop ends,so we have to give it on line no 14
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==Integer.MAX_VALUE){
                  break;
                }
                if (arr[i]==arr[j]){
                    count++;
                   arr[j]=Integer.MAX_VALUE;
                }
            }
            if (count==0 && arr[i]!=Integer.MAX_VALUE){
//                a[k]=arr[i];
//                k++;
                a1.add(arr[i]);
            }
        }
//        System.out.println(Arrays.toString(a));
        System.out.println(a1);
    }
}
