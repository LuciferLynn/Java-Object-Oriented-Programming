package designPattern_factory_1;

public class Rectangle implements Shape{

    private String name;

    Rectangle(){

    }

    Rectangle(String name){
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
        System.out.println("\nRectangle.draw called.");
        System.out.println(name + " has successfully been drawn!");
    }
}
