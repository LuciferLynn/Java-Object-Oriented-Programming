package _Exercise45_Shapes;

public class Rectangle extends Shape{

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return length*2 + width*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Shape[color=" + super.getColor() + "filled=" +super.isFilled() +
                "],width=" + width +
                ", length=" + length +
                '}';
    }

}
