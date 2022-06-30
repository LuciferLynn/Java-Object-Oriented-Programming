package Polymorphism_Practice;

public class Animal {

    // 1. Data members
    public String name;
    public String color;

    // 2. Constructors
    Animal() {
        name = "no name given yet";
        color = "no color defined yet";
    }

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 3. Methods
    public void eat() {
        System.out.println("munch munch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
