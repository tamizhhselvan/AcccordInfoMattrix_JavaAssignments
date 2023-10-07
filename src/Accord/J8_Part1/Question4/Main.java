package Accord.J8_Part1.Question4;


/*
        4. Create a class named Banking. It should contain methods for withdraw
            and deposit. Account balance should be defined as public variable and
            used in both methods.
 */

    class Banking{
        int accountBalance =2000;

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
        Banking obj = new Banking();

       int balanceAfterWithdrawn = obj.withdraw(100);
        System.out.println(balanceAfterWithdrawn);

       int balanceAfterDeposit = obj.deposit(300);
        System.out.println(balanceAfterDeposit);
    }
}
