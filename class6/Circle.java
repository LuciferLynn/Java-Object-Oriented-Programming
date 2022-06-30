package class6;

public class Circle extends GeometricObject {

    private double radius;

    Circle() { }

    Circle(double radius) {
        System.out.println("Circle Object called");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return getDiameter() * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}
