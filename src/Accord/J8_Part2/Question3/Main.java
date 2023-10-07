package Accord.J8_Part2.Question3;

/*
    3. Write a class with constructor. Initialize 2 numbers in constructor. Write
            methods to return quotient and reminder of those 2 numbers.
 */

class Operations{
    int n1;
    int n2;

     Operations(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    int reminder (){
         return n1%n2;
    }
    int quotient(){
         return n1/n2;
    }
}
public class Main {
    public static void main(String[] args) {
        Operations obj = new Operations(45,6);
        int reminder=obj.reminder();
        System.out.println(reminder);
        int quotient = obj.quotient();
        System.out.println(quotient);
    }
}
