package Accord.J13_Part2.Question1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
        1. Write a program to read a text file and display the no of alphabets, numbers, special symbols, blank
            spaces in the file.
 */

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\AccordJava.txt";

        int alphabetCount = 0;
        int numberCount = 0;
        int specialSymbolCount = 0;
        int spaceCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        alphabetCount++;
                    } else if (Character.isDigit(ch)) {
                        numberCount++;
                    } else if (Character.isWhitespace(ch)) {
                        spaceCount++;
                    } else {
                        specialSymbolCount++;
                    }
                }
            }
            reader.close();

            System.out.println("Number of Alphabets: " + alphabetCount);
            System.out.println("Number of Numbers: " + numberCount);
            System.out.println("Number of Special Symbols: " + specialSymbolCount);
            System.out.println("Number of Blank Spaces: " + spaceCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

