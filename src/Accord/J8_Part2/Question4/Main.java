package Accord.J8_Part2.Question4;
/*
    4. Create a class named Banking. It should contain methods for withdraw
        and deposit. Account balance should be initialized in a constructor.

        // actually this question is similar to the previous question (i.e package Accord.J8_Part1.Question4;)
        // we're just adding a constructor that take value while declaring it
 */

class Banking{
    int accountBalance;

     Banking(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    int withdraw( int withdrawAmount){

        this.accountBalance =accountBalance-withdrawAmount;
        return accountBalance;
    }

    int deposit(int depositAmount){
        this.accountBalance=accountBalance+depositAmount;
        return accountBalance;
    }
}
public class Main {
    public static void main(String[] args) {
        Banking obj = new Banking(2000);

        int balanceAfterWithdrawn = obj.withdraw(100);
        System.out.println(balanceAfterWithdrawn);

        int balanceAfterDeposit = obj.deposit(300);
        System.out.println(balanceAfterDeposit);
    }

}
