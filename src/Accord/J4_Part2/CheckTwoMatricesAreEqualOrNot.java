package Accord.J4_Part2;

public class CheckTwoMatricesAreEqualOrNot {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{1,4,4}};
        int[][]arr1={{4,5,6},{7,6,9},{1,5,6}};
        int count=0;
        if (arr.length==arr1.length){
            for (int i = 0; i < arr.length; i++) {

                        if(arr[i].length!=arr1[i].length){ // if(arr[i]!=arr1[i]) //// this is used to check the values instead the size of the arr of the row
                            count++;
                            break;
                        }
            }
            if (count == 0) {
                System.out.println("Matrices are equal");
            }
            else System.out.println("Matrices are not equal");
        }


    }
}
