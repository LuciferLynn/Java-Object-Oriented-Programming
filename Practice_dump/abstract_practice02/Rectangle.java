package abstract_practice02;

public class Rectangle implements Polygon_maths {
    // 1. Data members
    private int length;
    private int width;

    // 2. Constructors
    Rectangle() {

    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // 3. Methods

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double CalculateArea() {
        return length*width;
    }

    @Override
    public double CalculatePerimeter() {
        return 2*length + 2*width;
    }
}
