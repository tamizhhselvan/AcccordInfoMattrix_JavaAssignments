package Accord.J12_Part2.Question3;


import java.util.Scanner;

/*
        3. Using User Defined Exception:
            Create a class for an electricity board that charges the following rates to
            users
            a) For first 100 units : 40p per unit
            b) For next 200 units : 50p per unit
            c) Beyond 300 units : 60p per unit
            All users are charged a minimum of Rs.50. If the total cost is more
            than Rs.250.00 then an additional charge of 15% are added.
            Write a Java Program using class to read number of units
            consumed & print out the charges.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter your Units: ");
            int units = in.nextInt();
            electricityBillCheck(units);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    static void  electricityBillCheck(int units) throws NegativeEB_ReadingException {
        double currentBill=0;
        if (units<0){
            throw new  NegativeEB_ReadingException("Unit should not be in Negative");
        }
        else if (units<=100){
            currentBill +=units * .4;
        } else if (units <=300) {
            currentBill +=units * .5;
        } else {
            currentBill += units * .6;
        }
        double totalBill;
        if (currentBill>250){
            totalBill= currentBill + currentBill *.15;
        }
        else totalBill = currentBill+50;

        System.out.println("Your Total EB charges is "+ (int)totalBill);
    }
}

class NegativeEB_ReadingException extends Exception{
    public NegativeEB_ReadingException(String message){
        super(message);
    }
}
