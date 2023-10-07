package Accord.J8_Part1.Question6;

/*
        6. Write a program to swap two values. Your program should have a swap
            function. In main method read 2 numbers and pass it to swap method.
 */



public class Main {

    public static void main(String[] args) {
     String ans =   swap(1,2);
        System.out.println(ans);
    }


    static String swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;

        return (a+" "+b);
    }
}
