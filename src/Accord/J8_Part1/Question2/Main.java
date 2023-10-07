package Accord.J8_Part1.Question2;




/*
2. Create a class named Circle. Should have one method to read input radius
as input. Copy radius into a public variable. Using that public variable,
calculate area and perimeter in 2 separate methods.
 */


class Circle{
    public int radius;

     Circle(int radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("the area of the circle is : "+ (Math.PI * radius * radius));
    }
    void perimeter(){
        System.out.println("the perimeter of the circle is : " + 2*Math.PI * radius);
    }
}


public class Main {
    public static void main(String[] args) {
        Circle obj = new Circle(8);
        obj.area();
        obj.perimeter();
    }

}
