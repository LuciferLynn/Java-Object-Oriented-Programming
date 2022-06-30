package designPattern_factory_1;

public class Circle implements Shape{

    private String name;

    Circle() {

    }

    Circle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("\nCircle.draw called.");
        System.out.println(name + " has successfully been drawn!");
    }
}
