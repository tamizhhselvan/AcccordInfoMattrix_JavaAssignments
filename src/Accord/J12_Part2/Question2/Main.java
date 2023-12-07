package Accord.J12_Part2.Question2;


import java.util.Scanner;

/*
        2. Read age from user and check if age eligible to vote or not. Create and
            throw custom exception, if age is given as negative.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");

            checkVoteEligibility(in.nextInt());
        } catch (NegativeAgeException e) {
            System.err.println(e.getMessage());
        } catch (LessThan18AgeException e) {
//            throw new RuntimeException(e);
            System.err.println(e.getMessage());
        }
    }

    static void checkVoteEligibility(int age) throws NegativeAgeException, LessThan18AgeException {

        if (age<0){
            throw new NegativeAgeException("Age Should Not bee in Negative.The given Age is Negative.");
        } else if (age<18) {
            throw new LessThan18AgeException("You are not eligible to vote.Wait for another " + (18-age)+"years" );
        }
    }
}
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}
class LessThan18AgeException extends Exception{
        public LessThan18AgeException(String message){
            super(message);
        }
}
