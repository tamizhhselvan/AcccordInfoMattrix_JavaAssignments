package Accord.J11_Part1.Question1;
/*
        1. Create a class named box with methods to find area of rectangle and
            square. Method name should be same.
            Formula for area of square is side*side
            Formula for area of rectangle is length*breadth
 */
class Box{
    int l;
    int b;
    int side;

    void rectangleArea(int l,int b){
        System.out.println("The area of the rectangle is " + l*b);
    }

    void squareArea(int side){
        System.out.println("The area of the square is " + side*side);
    }
}
public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        box.rectangleArea(6,11);
        box.squareArea(69);
    }
}
