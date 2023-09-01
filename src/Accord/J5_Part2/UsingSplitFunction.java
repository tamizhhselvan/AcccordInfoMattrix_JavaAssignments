package Accord.J5_Part2;

import java.util.Arrays;

public class UsingSplitFunction {
    public static void main(String[] args) {
        String name ="Java is a high level programming language";
       String[] result = name.split("a");
        System.out.println(Arrays.toString(result));
    }
}
