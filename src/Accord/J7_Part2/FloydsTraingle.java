package Accord.J7_Part2;

public class FloydsTraingle {
    public static void main(String[] args) {
        int no=1;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
    }
}
