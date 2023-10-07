package Accord.J9_Part1.Question3;
/*
        3. Create a class named "Shape" with a method to print "This is shape"
            Then create two other classes named "Rectangle","Circle" inheriting the Shape
            class, both having a method to print "This is rectangular shape" and "This is
            circular shape" respectively. Create a subclass "Square" of "Rectangle"having a
            method to print "Square is a rectangle". Now call the method of "Shape" and
            "Rectangle" class by the object of "Square" class.
 */

class Shape{

    void printShape(){
        System.out.println("This is in Shape function");
    }
}

class Rectangle extends Shape{
    void printRectangle(){
        System.out.println("This is in rectangular shape");
    }
}

class Square extends Rectangle{
    void printSquare(){
        System.out.println("This is in square rectangular");
    }
}

class Circle extends Shape{
    void printCircle(){
        System.out.println("This is circular Shape");
    }
}


public class Main {
    public static void main(String[] args) {
        Square obj = new Square();

        obj.printSquare();      // this object is calling its own i.e square function method
        obj.printRectangle();   // this object is calling its parent class i.e rectangle function method
        obj.printShape();       // this object is calling parents class of its parent class
                                // -since they are all extending from same parent class of Shape
    }
}
