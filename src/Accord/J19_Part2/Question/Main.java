package Accord.J19_Part2.Question;


class MultiplicationTable implements Runnable {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MultiplicationTable(3));
        Thread thread2 = new Thread(new MultiplicationTable(7));

        thread1.start();
        thread2.start();
    }
}
