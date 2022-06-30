package abstract_practice01;

public abstract class Animal {
    int age;
    String name;

    Animal(){

    }

    public Animal(String name, int age) {
    }

    public abstract void makeNoise();

    public void printName() {
        System.out.println("My name is " + name);
    }
}
