package Accord.J11_Part2.Question2;

import java.util.Scanner;

/*
            2. Create a super class Employee and get staff id, name, basic
                salary,allowances from the user.
                Create a sub class Marketing extends Employee and get sales incentives
                and calculate net pay print it all data using method overriding.
 */
class Employee{
    int staffId;
    String name;
    int basicSalary;
    int allowance;

    public Employee(int staffId, String name, int basicSalary, int allowance) {
        this.staffId = staffId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }
}
class Marketing extends Employee{
    int incentive = 100;
    public Marketing(int staffId, String name, int basicSalary, int allowance) {
        super(staffId, name, basicSalary, allowance);

    }
    void netPayAndDetails(){
        System.out.println("Employee name " + name);
        System.out.println("Employee ID " + staffId);
        System.out.println("employee net pay includes allowance and incentive " + (basicSalary+allowance+incentive));

    }

}

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your allowance based on your performance ");
        int allowance = in.nextInt();
        Marketing obj = new Marketing(6969,"Raj",69000,allowance);
        obj.netPayAndDetails();
    }
}
