package designPattern_factory_3;

public class Client_main {

    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();

        Laptop laptop1 = new AsusG531GT();
        Laptop laptop2 = new Lenovo_Legion5();
        Laptop laptop3 = new unregisteredLaptop();

        laptop1.detect();
        laptop1.turnOn();

        laptop2.detect();
        laptop2.turnOn();

        laptop3.detect();
        laptop3.turnOn();

    }

}
