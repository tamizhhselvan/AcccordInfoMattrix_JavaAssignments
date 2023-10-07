package Accord.J8_Part1.Question1;



/* 1. Create a class for Calculator. Write methods for finding sum, difference,
product and quotient. All methods should take 2 numbers as input and
return one integer.
 */



class  Calculator{
    int sum;
    int difference;
    int product;
    int quotient;
     int sum (int a,int b){
        return a+b;
    }

     int difference(int a,int b){
        return a-b;
    }

     int product(int a, int b){
        return a*b;
    }

     int quotient (int a,int b){
         if(b!=0) {
             return a / b;
         }
         else {
             System.out.print("invalid input, b can't be ");
             return 0;
         }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.sum(4, 5));
        System.out.println(obj.quotient(5,0));
        System.out.println(obj.difference(10,5));
        System.out.println(obj.product(23,3));
    }
}