package Polymorphism_Practice;

public class Polymorphism_animals {

    public static void main(String[] args) {

        // default animal = munch munch
        // dog = chomp chomp
        // cat = nom nom nom

        Animal myAnimal = new Animal("Animal 1", "Albino");
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getColor());
        myAnimal.eat();
        skip_line();

        Dog myDog = new Dog("Bobby", "White");
        System.out.println(myDog.getName());
        System.out.println(myDog.getColor());
        myDog.eat();
        skip_line();

        Cat myCat = new Cat();
        System.out.println(myCat.getName());
        System.out.println(myCat.getColor());
        myCat.eat();
        skip_line();

    }

    private static void skip_line() {
        System.out.println();
    }

}
