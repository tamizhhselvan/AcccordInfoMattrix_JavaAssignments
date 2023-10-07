package Accord.J8_Part1.Question5;

/*
    5. Create a class named Employee with public variables ID, name,
        department and salary. Write separate methods to assign the values and to
        print the values.
 */


 class Employee{
    int id;
    String name;
    String dept;
    int salary;

     void assigning(int id, String name,String dept,int salary){
         this.dept=dept;
         this.id=id;
         this.name=name;
         this.salary=salary;
     }

     void printing(){
         System.out.println(id);
         System.out.println(name);
         System.out.println(dept);
         System.out.println(salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.assigning(69,"Bond","Finance",69000);
        obj.printing();
//        obj.assigning(43,"tamil","engineer",6969);
//        obj.printing();
    }
}
