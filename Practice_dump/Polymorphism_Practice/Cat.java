package Polymorphism_Practice;

public class Cat extends Animal {

    // 1. Data members

    // 2. Constructors
    Cat() {
        // will inherit from parent class (Animal)
    }

    Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //3. Methods
    @Override
    public void eat() {
        System.out.println("nom nom nom");
    }

}
