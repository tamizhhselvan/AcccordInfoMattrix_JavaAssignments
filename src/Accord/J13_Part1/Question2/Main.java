package Accord.J13_Part1.Question2;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\tamil\\Desktop\\Untitled-2023-11-03-2137.png";
        String destinationFilePath = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\nothing.bmp";

        try {
            File sourceFile = new File(sourceFilePath);
            File destinationFile = new File(destinationFilePath);

            if (!sourceFile.exists()) {
                throw new FileNotFoundException("Source file does not exist.");
            }

            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("Image file copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

