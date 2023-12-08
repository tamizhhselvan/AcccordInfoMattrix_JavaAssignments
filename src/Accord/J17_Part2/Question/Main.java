package Accord.J17_Part2.Question;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


       while (true) {
           System.out.println("Enter 1 to Insert new Employee Data ");
           System.out.println("Enter 2 to View Current Employees Data");
           System.out.println("Enter 3 to view on specific Departments");
           System.out.println("Enter 4 to Select Employees by their Salary Range");
           System.out.println("Enter 5 to Exit");
           System.out.println("=======================================================");
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
               }
               else if (input == 2) {
                   obj.view();
               } else if (input==3) {
                   System.out.println("Select Any of the Following departments- IT,HR,FINANCE ");
                   String dept = in.next();
                   obj.selectDept(dept);
               } else if (input==4) {
                   System.out.println("Enter minimum salary:");
                   double minSalary = in.nextDouble();

                   System.out.println("Enter maximum salary:");
                   double maxSalary = in.nextDouble();
                   obj.selectSalaryRange(minSalary,maxSalary);
               } else if (input == 5) {
                   obj.close();
                   break;
               }
               else System.out.println("Select Correctly from 1 to 3");

           } catch (Exception e) {
               System.err.println(e);
           }
//           if (input == 5){
////               break;
//           }
       }
    }
}
