package Accord.J4_Part1;

public class LargestInTheArray {
    public static void main(String[] args) {
        int [] arr={7,9,4,2,1,98,100,450,45};

        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (ans<arr[i]){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
