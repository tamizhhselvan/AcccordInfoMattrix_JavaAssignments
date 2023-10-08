package Accord.J10_Part2.Question1;

/*
    1. Write a java program to create an abstract class named Shape that
        contains empty method named printArea(). Provide three classes named
        Rectangle, Triangle and Circle such that each one of the classes extends
        the class Shape. Each one of the classes contain only the method
        printArea() that prints the area of the given shape.
 */


abstract class Shape{
   abstract void printArea();
}

class Rectangle extends Shape{
    @Override
    void printArea() {
        System.out.println("The area of the rectangle is l*b ");
    }
}

class Triangle extends Shape{
    @Override
    void printArea() {
        System.out.println("The area of the triangle is 0.5*h*b");
    }
}

class Circle extends Shape{
    @Override
    void printArea() {
        System.out.println("The area of the circle is pi*r*r");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Triangle obj2 = new Triangle();
        Circle obj3 = new Circle();

        obj1.printArea(); // calling the printArea() in Rectangle class
        obj2.printArea(); // calling the printArea() in Triangle class
        obj3.printArea(); // calling the printArea() in Circle class
    }
}
