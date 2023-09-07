package Accord.J7Part1;

import java.util.Arrays;

public class ReversingEachWordInString {
    public static void main(String[] args) {

        String str ="java program";
        String[] words =str.split(" ");
        String reversedString = "";
       for (String word:words){          // this is enhanced for loop
                                        // for (int i = 0; i < words.length; i++) {
                                        // String word = words[i];
           String reversedWord = "";
           for (int i = word.length() - 1; i >= 0; i--) {
               reversedWord += word.charAt(i);
           }
           reversedString += reversedWord + " ";

       }
        System.out.println(reversedString);
    }
}
