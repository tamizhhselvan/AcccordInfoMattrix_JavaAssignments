package Accord.untill_J3_Part1;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        int x= 4;
        int a= x++ *2;
        System.out.println(a);  // This will print 8 because it is post increment,
                                // it will increment the value of x after assigning it to a

        int y=4;
        int b = ++y * 2;
        System.out.println(b); // here this will print 10 because it is post increment
    }
}
