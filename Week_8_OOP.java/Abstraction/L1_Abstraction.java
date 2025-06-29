import java.util.Scanner;

// Inside a class if a single method is abstract declare class as abstract 
abstract class Shape {

    float area;


    abstract void acceptInput();

    abstract void calcArea();

    void disArea() {
        System.out.println(area);
    }
}   

class Square extends Shape {

    private float side;

    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Square : ");
        side = sc.nextFloat();
    }

    void calcArea() {
        area = side * side;
    }

}

class Rectangle extends Shape {

    private float length;
    private float breadth;

    void acceptInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle ");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle ");
        breadth = sc.nextFloat();
    }

    void calcArea() {
        area = length * breadth;
    }

}

class Circle extends Shape {

    private float radius;

    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
    }

    void calcArea() {
        area = (float) (3.14 * radius * radius);

    }
}

public class L1_Abstraction {

    public static void main(String[] args) {

        Square sq = new Square();
        Rectangle re = new Rectangle();
        Circle ci = new Circle();

        sq.acceptInput();
        sq.calcArea();
        sq.disArea();

    }
}
