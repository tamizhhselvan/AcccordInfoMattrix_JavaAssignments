package Accord.J13_Part2.Question2;

import java.io.*;
/*
        2. Write a program that get the name of the file as input from the user and display all the words in
            alphabetical order.
 */

public class Main {
    public static void main(String[] args) {

        try {
            String sourceFile = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\input.txt";

            String destinationFile = "C:\\Users\\tamil\\Desktop\\Java_IO_Workings\\op1.txt";

            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destinationFile);

            int i =0;
            String s="";
            while ((i=fr.read())!=-1){
                s =s+(char)i;
            }
            String[] sr = s.split(" ");

            String temp;
            String output="";
            for (int j = 0; j < sr.length; j++) {
                for (int k = j+1; k < sr.length; k++) {
                    if (sr[j].compareTo(sr[k])>0){
                        temp = sr[j];
                        sr[j] = sr[k];
                        sr[k] = temp;
                    }
                }
                output = output + sr[j]+" ";
            }
            fw.write(output);
            for (int j = 0; j < sr.length; j++) {
                System.out.println(sr[j]);
            }
            fr.close();
            fw.close();


        }  catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
