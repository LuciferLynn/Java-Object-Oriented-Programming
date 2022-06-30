package designPattern_factory_3;

public class LaptopFactory {
    public Laptop getLaptop(String str) {
        if (str=="Lenovo Legion5") {
            return new Lenovo_Legion5();
        }
        else if (str=="AsusG531GT") {
            return new AsusG531GT();
        }else {
            return new unregisteredLaptop();
        }
    }
}
