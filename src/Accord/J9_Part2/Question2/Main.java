package Accord.J9_Part2.Question2;
/*
    2. Create class Employee with name, id, designation, department,
        salary as members. Create methods to set input values and print data.
        Also create separate class for Marketing with sales incentives as member.
        Create separate methods to calculate total salary for a marketing
        employee.
 */

class Employee {
    String name ;
    int id;
    String designation;
    public int salary;

    public Employee(String name, int id, String designation, int salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }



    void printEmployeeDetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee designaton: "+designation);
        System.out.println("Employee salary: " + salary);
    }
}

class Marketing extends Employee{
    int salesIncentive=1000;

    public Marketing(String name, int id, String designation, int salary) {
        super(name, id, designation, salary);
    }

    void totalSalaryOfMarketingEmployee(){
        System.out.println("Total salary is : " + (salary+salesIncentive) );
    }

}

public class Main {
    public static void main(String[] args) {
     Marketing obj = new Marketing("Raj",69,"MarketingExecutive",69000);
        obj.printEmployeeDetails();
        obj.totalSalaryOfMarketingEmployee();
    }

}
