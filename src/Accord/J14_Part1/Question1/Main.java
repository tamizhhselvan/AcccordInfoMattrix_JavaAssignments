package Accord.J14_Part1.Question1;
/*
    1. Create an employee class with ID, name, designation and salary. It should be serializable. It should
        contain constructor, getters and setters.

    2. Read values from user and create an employee object.

    3. Serialize the object and store it in a file named as emp.ser
 */
import java.io.*;
import java.util.*;

class Employee implements Serializable{
    int eId;
    String eName;
    String eDesignation;
    int eSalary;

    public Employee(int eId, String eName, String eDesignation, int eSalary) {
        this.eId = eId;
        this.eName = eName;
        this.eDesignation = eDesignation;
        this.eSalary = eSalary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteDesignation() {
        return eDesignation;
    }

    public void seteDesignation(String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Enter Employee details");
            System.out.println();
            System.out.print("Enter Employee id:");
            int eId = in.nextInt();
            System.out.print("Enter Employee Name:");
            String eName = in.next();
            System.out.print("Enter Employee Designation:");
            String eDesignation = in.next();
            System.out.print("Enter Employee Salary:");
            int eSalary = in.nextInt();
            Employee obj = new Employee(eId,eName,eDesignation,eSalary);
            FileOutputStream fo = new FileOutputStream("C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\EmployeeDetails.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();fo.close();in.close();
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
