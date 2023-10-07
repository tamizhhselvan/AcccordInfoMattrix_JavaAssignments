package Accord.J9_Part1.Question1;
/*
    1. Create a class with a method that prints "This is parent class" and its subclass
        with another method that prints "This is child class". Now, create an object for
        each of the class and call
        1 - method of parent class by object of parent class
        2 - method of child class by object of child class
        3 - method of parent class by object of child class
 */

class Parent{
    void printParent(){
        System.out.println("This is Parent Class");
    }
}

class Child extends Parent{
    void printChild(){
        System.out.println("This is Child Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Parent();

        Child obj1 = new Child();
        obj.printParent();  //   method of parent class by object of parent class
        obj1.printChild();  //   method of child class by object of child class
        obj1.printParent(); //   method of parent class by object of child class
    }
}
