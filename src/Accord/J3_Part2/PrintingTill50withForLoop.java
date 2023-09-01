package Accord.J3_Part2;

public class PrintingTill50withForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if ((i%5)==0 && (i%3)==0 ){
                System.out.println("Accord Info Matrix");
            } else if ((i % 3) == 0) {
                System.out.println("accord ");
            } else if ((i % 5) == 0) {
                System.out.println("infomatrix");
            }
            else System.out.println(i);
        }
    }
}
