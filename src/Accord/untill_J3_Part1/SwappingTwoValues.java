package Accord.untill_J3_Part1;

public class SwappingTwoValues {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);


    }
}
