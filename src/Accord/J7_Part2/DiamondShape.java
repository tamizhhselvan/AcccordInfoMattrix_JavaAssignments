package Accord.J7_Part2;

public class DiamondShape {
    public static void main(String[] args) {
        int n=5;

        for (int row = 1; row <2*n; row++) {
                int totalColsInThatRow = row > n? 2*n-row:row;
                int blank=n-totalColsInThatRow;
            for (int i = 0; i < blank; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInThatRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
