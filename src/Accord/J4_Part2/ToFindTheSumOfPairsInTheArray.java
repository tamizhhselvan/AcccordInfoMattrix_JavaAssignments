package Accord.J4_Part2;

public class ToFindTheSumOfPairsInTheArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,5,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==9){
                    System.out.print(arr[i]+"," +arr[j]);
                    System.out.println();

                }
            }
        }
    }
}
