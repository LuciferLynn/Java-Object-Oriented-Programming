package abstract_practice01;

public class Dog extends Animal{

    Dog() {

    }
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }

}
