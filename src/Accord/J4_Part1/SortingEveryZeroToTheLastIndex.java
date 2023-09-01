package Accord.J4_Part1;

public class SortingEveryZeroToTheLastIndex {
    public static void main (String [] args){
       int [] arr= {1,2,0,5,0,4,0,7,0,9,0};
       int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                    if (arr[j]>arr[j+1]){

                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
            }
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+",");

        }
    }
}
