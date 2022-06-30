package abstract_practice01;

public class Cat extends Animal implements AnimalStuff{

    Cat() {

    }

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        System.out.println("meowpoo");
    }
}
