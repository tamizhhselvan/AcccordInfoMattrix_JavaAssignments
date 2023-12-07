package Accord.J13_Part1.Question1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
    1. Use File Reader class and read content from a file. Count number of characters in file. If file does not
        exist, handle exception.
 */

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\AccordJava.txt";

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new IOException("File does not exist.");
            }

            FileReader fileReader = new FileReader(file);
            int character;
            int count = 0;

            while ((character = fileReader.read()) != -1) {
                count++;
            }

            fileReader.close();

            System.out.println("Number of characters in the file: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
