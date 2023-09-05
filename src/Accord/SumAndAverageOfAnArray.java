package Accord.J6_Part2;

public class SumAndAverageOfAnArray {
    public static void main(String[] args) {
        int [] a ={4,2,5,1,3};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
        int average = sum/a.length;
        System.out.println(average);
    }
}
