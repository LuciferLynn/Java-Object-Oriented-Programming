package designPattern_factory_3;

public class unregisteredLaptop implements Laptop{

    @Override
    public void detect() {
        System.out.println("Unregistered laptop detected");
    }

    @Override
    public void turnOn() {
        System.out.println("The unregistered laptop has been turned on");
    }

}
