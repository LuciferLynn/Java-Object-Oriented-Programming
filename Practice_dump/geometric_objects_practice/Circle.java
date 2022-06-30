package geometric_objects_practice;

public class Circle extends GeometricObject{

    // 1. Data members
    private double radius;

    // 2. Constructors

    Circle() {
        System.out.println("No-arg constructor from Circle called");
    }

    Circle(double radius) {
        System.out.println("Radius argument from Circle called");
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        System.out.println("Constructor from GeometricObject called");
        this.radius = radius;
        System.out.println("Radius argument from Circle called");
    }

    // 3. Methods


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

}
