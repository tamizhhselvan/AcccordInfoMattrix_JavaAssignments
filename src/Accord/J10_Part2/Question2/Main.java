package Accord.J10_Part2.Question2;
/*
        2. Write an abstract class named Employee that contains
            a. Abstract method for attendance
            b. Final method to remove employee
            c. Non abstract method for calculating salary as basic pay – pf
            Write 2 classes, Marketing and NewJoinee.
            In Marketing class, implement attendance() and salary(). Add
            Incentives in salary along with salary() in abstract class.
            In NewJoinee class, implement only attendance()
 */
abstract class Employee{
    int basicPay;
    int pf;
    int salary;
    abstract void attendance();
    final void removeEmployee(){
    }
    void calculateSalary(int basicPay,int pf){
        this.salary=basicPay-pf;
        System.out.println(salary);
    }
}
class Marketing extends Employee{
    int incentive=100;
    @Override
    void attendance() {
        System.out.println("Marketing employee attendance");
    }
    //@Override
    void calculateSalaryWithIncentive() {
        this.salary+=incentive;
        System.out.println(salary);
       //return this.salary+=incentive;
    }
}
class NewJoinee extends Employee{


    @Override
    void attendance() {
        System.out.println("New joinee attendance");
    }
}

public class Main {
    public static void main(String[] args) {
            Marketing obj1 = new Marketing();
            NewJoinee obj2 = new NewJoinee();

            obj1.calculateSalary(15000,1000);
            obj1.calculateSalaryWithIncentive();
    }
}
