package u6411271_question2;

import u6411271_question1.Circle;

public class HollowCylinder extends Circle {

    // 1. Data members
    private double inner_radius = 0.5; // create new data member for hollow cylinder, give it default value 0.5
    private double height = 1.0; // create data member for height because it's not included in the Circle class

    // 2. Constructors
    HollowCylinder() {

    }

    HollowCylinder(double radius, double inner_radius, double height) {
        super(radius);
        this.height = height;
        this.inner_radius = inner_radius;
    }

    HollowCylinder(double radius, double inner_radius, double height, String color) {
        super(radius, color);
        this.height = height;
        this.inner_radius = inner_radius;
    }

    // 3. Methods

    public double getInner_radius() {
        return inner_radius;
    }

    public void setInner_radius(double inner_radius) {
        this.inner_radius = inner_radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * (getRadius()*getRadius() - inner_radius*inner_radius) * height;
    }

    @Override
    public String toString() {
        return "HollowCylinder{" +
                "radius=" + getRadius() +
                ", inner_radius=" + inner_radius +
                ", height=" + height +
                ", color=" + getColor() +
                ", volume=" + getVolume() +
                '}';
    }
}
