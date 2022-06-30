package __FinalProject;

public class LaptopFactory {

    public Laptop getLaptop(String str) {
        if (str == "LenovoLegion") {
            return new Lenovo_Legion();
        }
        else if (str == "AsusGStrix") {
            return new Asus_gStrix();
        }
        else {
            return new unregisteredLaptop();
        }
    }

    public Laptop getLaptop(String str, Mouse mouse, Keyboard keyboard) {
        if (str == "LenovoLegion") {
            return new Lenovo_Legion(mouse,keyboard);
        }
        else if (str == "AsusGStrix") {
            return new Asus_gStrix(mouse,keyboard);
        }
        else {
            return new unregisteredLaptop(mouse,keyboard);
        }
    }

}