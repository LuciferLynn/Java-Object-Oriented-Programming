package Polymorphism_Practice;

public class Dog extends Animal{

    // 1. Data members

    // 2. Constructors
    Dog() {
        // will inherit from parent class (Animal)
    }

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 3. Methods

    @Override
    public void eat() {
        System.out.println("chomp chomp");
    }
}
