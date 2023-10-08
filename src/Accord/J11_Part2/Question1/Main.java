package Accord.J11_Part2.Question1;
/*
            1. Create a base class named Bank with method for interest calculation with
                3% of account balance. Create derived classes for ICICI and SBI. Each
                class should have their own interest calculation method with 4% and
                4.5% each.
 */

class Bank{
    int accountBalance;

    void interestCal(int accountBalance){
        int interestPercent=3;
        System.out.println("The accumulated interest for your balance is " + (interestPercent * accountBalance)/100);
    }
}

class ICICi extends Bank{
    int accountBalance;
    void ownInterestCal(int accountBalance){
        int interestPercent = 4;
        System.out.println("The accumulated interest for your balance is " + (interestPercent * accountBalance)/100);
    }
}

class SBI extends Bank{
    int accountBalance;
    void ownInterestCal(int accountBalance){
        float interestPercent = 4.5f;
        System.out.println("The accumulated interest for your balance is " + (interestPercent * (float) accountBalance)/100);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank  obj  = new Bank();
        ICICi obj1 = new ICICi();
        SBI   obj2 = new SBI();

        obj.interestCal(15000);     // calling Bank class's method
        obj1.ownInterestCal(2000);  // calling ICICI class's method
        obj2.ownInterestCal(2500);  // calling SBI class's method
    }
}
