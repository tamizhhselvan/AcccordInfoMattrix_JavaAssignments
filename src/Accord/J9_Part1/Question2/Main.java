package Accord.J9_Part1.Question2;
/*
        2. Create a class named "Rectangle"; with two data members "length" and
            "breadth"  and two methods to print the area and perimeter of the rectangle
            respectively. Its constructor having parameters for length and breadth is used
            to initialize length and breadth of the rectangle. Let class "Square" inherit the
            "Rectangle" class with its constructor having a parameter for its side (suppose
            s) calling the constructor of its parent class as "super(s,s)" Print the area and
            perimeter of a rectangle and a square.
 */

class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        this.breadth=-1;
        this.length=-1;
    }

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

     void rectangleArea(){
         System.out.println("The area of rectangle is "+length*breadth);
    }

    void rectanglePerimeter(){
        System.out.println("The perimeter of rectangle is "+2*(length+breadth));
    }
}

class Square extends Rectangle{

    int sqSide;
    Square(int length, int breadth,int sqSide) {
        super(length, breadth);
        this.sqSide =sqSide;
    }

    Square(int sqSide){
        super();
        this.sqSide=sqSide;
    }


    void sqArea(){
        System.out.println("The square area "+sqSide*sqSide);
    }
    void sqPerimeter(){
        System.out.println("The square perimeter " + 4*sqSide);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4,6);
       obj.rectangleArea();
       obj.rectanglePerimeter();

       Square obj1 = new Square(4,5,8);
        System.out.println("Now printing the value after modifying via child class");
       obj1.rectangleArea();
       obj1.rectanglePerimeter();
       obj1.sqArea();

    }
}
