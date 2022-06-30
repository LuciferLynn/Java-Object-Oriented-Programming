package Practice1;

public class circle {

    // 1. Data members
    double radius;
    double perimeter;
    double area;
    static int numberOfCircles;

    // 2. Constructors
    circle() {

    }

    circle(double radius) {
        numberOfCircles++;
        this.radius = radius;
    }

    // 3. Methods
    void printRadius() {
        System.out.println(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        perimeter = Math.PI * 2 * radius;
        return perimeter;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        area = Math.PI * (Math.pow(radius, 2));
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public static void setNumberOfCircles(int numberOfCircles) {
        circle.numberOfCircles = numberOfCircles;
    }
}
