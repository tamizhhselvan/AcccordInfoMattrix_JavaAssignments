package Accord.J13_Part1.Question4;

/*
        4. Read content from a file and reverse it. Store result in another file.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\AccordJava.txt";
        String outputFilePath = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\output.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();


            content.reverse();


            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("Content from '" + inputFilePath + "' reversed and stored in '" + outputFilePath + "'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

