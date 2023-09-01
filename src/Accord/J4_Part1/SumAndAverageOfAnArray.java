package Accord.J4_Part1;

public class SumAndAverageOfAnArray {
    public static void main(String[] args) {

        int [] a = {1,4,5,3,2};
        int sum=0;
        int average =0;

        for (int i = 0; i < a.length; i++) {
            sum= sum+a[i];
        }

        System.out.println(" sum = "+sum);
        average=sum/a.length;
        System.out.println( " Average = "+ average);

    }

}
