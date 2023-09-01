package Accord.J4_Part1;

public class ReverseTheArray {
    public static void main(String[] args) {
        int [] a={1,4,5,3,2};

        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i] + ",");
        }
    }
}
