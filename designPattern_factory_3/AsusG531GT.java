package designPattern_factory_3;

public class AsusG531GT implements Laptop{

    @Override
    public void detect() {
        System.out.println("Asus G531GT detected");
    }

    @Override
    public void turnOn() {
        System.out.println("Asus G531GT turned on");
    }

}
