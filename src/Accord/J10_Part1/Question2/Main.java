package Accord.J10_Part1.Question2;
/*
        2. We have to calculate the percentage of marks obtained in three subjects (each
            out of 100) by student A and in four subjects (each out of 100) by student B.
            Create an abstract class "Marks" with an abstract method "getPercentage". It is
            inherited by two other classes "A" and "B" each having a method with the same
            name which returns the percentage of the students. The constructor of student A
            takes the marks in three subjects as its parameters and the marks in four
            subjects as its parameters for student B. Create an object foreach of the two
            classes and print the percentage of marks for both the students.
 */


abstract class Marks{
  // abstract int getPercentage(int mark1,int mark2,int mark3);
   // abstract int getPercentage(int mark1, int mark2, int mark3, int mark4);
    abstract int getPercentage();

}
class StudentA extends Marks{

    int mark1;
    int mark2;
    int mark3;
    int avg;

    public StudentA(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.avg = (mark1+mark2+mark3)/3;
    }

    @Override
    int getPercentage() {
        return avg;
    }

//    @Override
//    int getPercentage(int mark1, int mark2, int mark3, int mark4) {
//        int avg = (mark1+mark2+mark3)/3;
//       // System.out.println("The percentage of student A is " + avg+"%");
//        return avg;
//    }
}
class StudentB extends Marks{
    int mark1; int mark2; int mark3; int mark4; int avg;

    public StudentB(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;

        avg=(mark1+mark2+mark3+mark4)/4;
    }

    @Override
    int getPercentage() {
        return avg;
    }

    //    @Override
//     int getPercentage(int mark1, int mark2, int mark3,int mark4)  {
//        int avg = (mark1+mark2+mark3)/3;
//        //System.out.println("The percentage of student B is "+ avg+"%");
//        return avg;
//    }
}


public class Main {
    public static void main(String[] args) {
//        System.out.println();
        StudentA obj1 = new StudentA(40,52,52);
        int avgA = obj1.getPercentage();
        StudentB obj2 = new StudentB(90,80,78,82);
        int avgB =obj2.getPercentage();
        System.out.println("The percentage of student A is " +avgA+"%");
        System.out.println("The percentage of student B is "+ avgB+"%");


    }
}
