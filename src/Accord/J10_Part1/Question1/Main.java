package Accord.J10_Part1.Question1;

/*
    1. Create an abstract class "Bank" with an abstract method "getBalance", $100,
        $150 and $200 are deposited in banks A, B and C respectively. "BankA" "BankB"
        and "BankC" are subclasses of class "Bank" each having a method named
        "getBalance";. Call this method by creating an object of each of the three classes.
 */

 abstract class Bank{
    // int balance;
   abstract void getBalance(int deposit);
        // System.out.println("The balance is " + (this.balance+=deposit));

}

class ABank extends Bank{
     int balance = 3000;
    @Override
    void getBalance(int deposit) {
        //super.getBalance(deposit);
        System.out.println("the balance of A bank is "+ (this.balance=balance+deposit));
    }
}

class BBank extends Bank{
     int balance =2000;
    @Override
    void getBalance(int deposit) {
     //   super.getBalance(deposit);
        System.out.println("the balance of B bank is "+ (this.balance=balance+deposit));
    }
}

class CBank extends Bank{
     int balance =1000;
    @Override
    void getBalance(int deposit) {
       // super.getBalance(deposit);
        System.out.println("the balance of C bank is "+ (this.balance=balance+deposit));
    }
}

public class Main {
    public static void main(String[] args) {
        ABank obj1 = new ABank();
        BBank obj2 = new BBank();
        CBank obj3 = new CBank();
        obj1.getBalance(100);
        obj2.getBalance(200);
        obj3.getBalance(250);

        // System.out.println(obj3.balance);
    }
}
