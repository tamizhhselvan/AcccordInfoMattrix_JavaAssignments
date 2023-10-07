package Accord.J8_Part1.Question3;


/*
       3. Create class named Student. Write methods to read marks as input and
            return total as output. Another method to take total and number of subject
            as input and return average.
 */

class Student{
    int mark1;
    int mark2;
    int mark3;
    int total;

    public int studentTotal(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

        return this.total=mark1+mark2+mark3;
    }
    public double avgMark(double noOfSubjects){
        return total/noOfSubjects;
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();

        int total = obj.studentTotal(98,87,96);

        double average = obj.avgMark(3);

        System.out.println("The total mark of the three subject is : " + total);
        System.out.println("The average of the marks is : " + average);
    }
}
