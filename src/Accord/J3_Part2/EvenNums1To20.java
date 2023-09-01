package Accord.J3_Part2;

public class EvenNums1To20 {
    public static void main(String[] args) {
        System.out.println("the even numbers are");
        for (int i = 1; i <= 20; i++) {

            if ((i & 1) == 0) {

                System.out.print(i+ " ");
            }

        }
    }
}
