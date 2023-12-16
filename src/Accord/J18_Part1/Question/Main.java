package Accord.J18_Part1.Question;

import java.util.Scanner;


/*
        1. Read employee id from user as input. Delete employee from table If existing. If not display an error
            message.
        2. Read employee id and new salary. Update new salary in table. Before updating check if new salary is
            greater than existing salary.
 */

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        try {
            DbCode dbCode = new DbCode();
            System.out.println("Enter 1 to Update Salary of Employee.");
            System.out.println("Enter 2 to Delete Employee from table.");

            int option1 = in.nextInt();

            if (option1==1){
                System.out.println("Enter Employee Id");
                int empId = in.nextInt();
                System.out.println("Enter new Salary");
                int salary = in.nextInt();
                dbCode.updateSalary(empId,salary);
            }
            else if (option1==2){
                System.out.println("Enter Employee Id");
                int empId = in.nextInt();
                if(dbCode.delete(empId)>0){
                    System.out.println("Deleted Successfully");
                }
            }
            else System.out.println("Please Enter Correct input:");
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
