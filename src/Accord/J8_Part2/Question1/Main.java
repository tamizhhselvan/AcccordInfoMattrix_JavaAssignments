package Accord.J8_Part2.Question1;


/*
        1. In Circle class in yesterday’s lab task. Use constructor to initialize radius.
            And use the same in other methods.

            // actually in previous package(i.e J8_Part1.Question2) we used the same logic as it mentioned in the above question so just copying it
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
