package Accord.J3_Part2;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 17;
        System.out.println("The multiplication table of " +n+" is" );
        for (int i = 1; i <= 20; i++) {
            int ans = i*n;

            System.out.println(i + " * "+ n +"="+ans );
        }
    }
}
