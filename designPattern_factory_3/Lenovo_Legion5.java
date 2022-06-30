package designPattern_factory_3;

public class Lenovo_Legion5 implements Laptop{

    @Override
    public void detect() {
        System.out.println("Lenovo Legion 5 detected");
    }

    @Override
    public void turnOn() {
        System.out.println("Lenovo Legion 5 turned on");
    }

}
