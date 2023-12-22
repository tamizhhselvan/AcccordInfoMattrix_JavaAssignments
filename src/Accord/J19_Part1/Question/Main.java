package Accord.J19_Part1.Question;


class DisplayAlphabets extends Thread{
    public synchronized void run(){
        for (char i = 'A'; i < 'K'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DisplayNumbers extends Thread{
  public synchronized void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
        DisplayAlphabets displayAlphabets = new DisplayAlphabets();
        DisplayNumbers displayNumbers = new DisplayNumbers();

        displayAlphabets.start();
        displayNumbers.start();

        // suppose if you want to print it in the order then use .joins
        /*
                 displayAlphabets.start();
        try {
            displayAlphabets.join(); // Wait for DisplayAlphabets thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        displayNumbers.start();
         */

    }

}
