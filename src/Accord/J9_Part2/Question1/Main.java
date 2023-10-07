package Accord.J9_Part2.Question1;

/*
    1. A bank maintains two kinds of accounts – Savings account and Current
        account. The savings account provides simple interest, deposit and
        withdrawal facilities. The current account only provides deposit and
        withdrawal facilities. Using inheritance write program for the same.
*/

 class CurrentAccount{

    int balance =1000;
    int deposit(int depositAmount){
       return this.balance=balance+depositAmount;
    }

    int withdraw(int withdrawAmount){

        return this.balance=balance-withdrawAmount;
    }

//     int deposit(int depositAmount){
//         this.balance = this.balance + depositAmount;
//         return this.balance;
//     }
//
//     int withdraw(int withdrawAmount){
//         this.balance = this.balance - withdrawAmount;
//         return this.balance;
//     }

 }
    class SavingsAccount extends CurrentAccount{

   // int interest = 5;


    void interest(){
        System.out.println("The interest for the Savings account is 5%");
    }
 }

public class Main {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();

        CurrentAccount obj1 = new CurrentAccount();

        System.out.println(obj.deposit(400));
        System.out.println(obj.withdraw(250));
        obj.interest();

        System.out.println(obj1.deposit(500));
        System.out.println(obj1.withdraw(150));
    }
}
