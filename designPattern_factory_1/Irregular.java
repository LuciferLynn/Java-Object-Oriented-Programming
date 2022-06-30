package designPattern_factory_1;

public class Irregular implements Shape{

    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("\nIrregular.draw called.");
        System.out.println(name + " has successfully been drawn!");
    }
}
