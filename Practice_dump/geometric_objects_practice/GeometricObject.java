package geometric_objects_practice;

import java.util.Date;

public class GeometricObject {

    // 1. Data members

    private String color;
    private boolean filled;
    private Date dateCreated;

    // 2. Constructors

    GeometricObject() {
        System.out.println("No-arg constructor from GeometricObject called");
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        System.out.println("Arg constructor from GeometricObject called");
        this.color = color;
        this.filled = filled;
    }

    // 3. Methods


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
