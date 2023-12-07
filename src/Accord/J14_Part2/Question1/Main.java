package Accord.J14_Part2.Question1;

/*
        1. Create a Student class with regno, name and marks in 5 subjects. It should be serializable. It should
            contain constructor, getters and setters.

        2. Read values from user and create a Student object.

        3. Serialize the object and store it in a file named same as the name of the student.

        4. Raise an exception if File Name already exists.
 */
import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    private String regno;
    private String name;
    private int[] marks;

    public Student() {
        marks = new int[5];
    }

    public Student(String regno, String name, int[] marks) {
        this.regno = regno;
        this.name = name;
        this.marks = marks;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's registration number:");
        String regNo = in.nextLine();
        System.out.print("Enter student's name:");
        String name = in.nextLine();
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = in.nextInt();
        }
        Student student = new Student(regNo, name, marks);

        try {
            File file = new File("C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\Student\\"+name + ".ser");
            if (file.exists()) {
                throw new IOException("File already exists!");
            }

            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(student);
            objectOut.close();
            fileOut.close();

            System.out.println("Student object serialized and stored in file: " + file.getName());
        }
        catch (IOException e){
            System.err.println("Exception occured,"+e.getMessage());
        }
    }
}
