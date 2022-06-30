package u6411271_question1;

public class Cylinder extends Circle{

    // 1. Data members
    private double height = 1.0;

    // 2. Constructors
    public Cylinder() {

    }
    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // 3. Methods

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() + ", " +
                "height=" + height + ", " +
                "color=" + getColor() +
                ", volume=" + getVolume() +
                '}';
    }
}
