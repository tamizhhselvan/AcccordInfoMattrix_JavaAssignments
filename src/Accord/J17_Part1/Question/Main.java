package Accord.J17_Part1.Question;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


       while (true) {
           System.out.println("Enter 1 to Insert new Employee Or 2 to View Current Employees Or 3 to Exit");
           int input = in.nextInt();
           try {
               DBCode obj = new DBCode();

               if (input == 1) {
                   System.out.print("Enter Employee ID:");
                   int eId = in.nextInt();
                   System.out.print("Enter Employee Name:");
                   String eName = in.next();
                   System.out.print("Enter Employee Experience (if any):");
                   int exp = in.nextInt();
                   System.out.print("Enter Employee salary:");
                   int salary = in.nextInt();
                   System.out.print("Enter Employee Department:");
                   String dept = in.next();
                   System.out.print("Enter Employee Location:");
                   String location = in.next();

                   if (obj.insertTable(eId, eName, dept, exp, salary, location) > 0) {
                       System.out.println("Inserted Successfully");
                   }
               } else if (input == 2) {
                   obj.view();
               } else if (input == 3) {
                   obj.close();
               }
               else System.out.println("Select Correctly from 1 to 3");

           } catch (Exception e) {
               System.err.println(e);
           }
           if (input == 3){
               break;
           }
       }
    }
}
