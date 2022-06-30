package designPattern_factory_1;

public class Square implements Shape{

    private String name;

    Square() {

    }

    Square(String name){
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
        System.out.println("\nSquare.draw called.");
        System.out.println(name + " has successfully been drawn!");
    }
}
