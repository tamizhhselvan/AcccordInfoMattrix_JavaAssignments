package Accord.J13_Part1.Question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
        3. Write a program to Java file content and display in output.
 */

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\AccordJava.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            System.out.println("Contents of the Java file '" + filePath + "':");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

