package __FinalProject;

public class laptopSetup_main {

    public static void main(String[] args) {

        LaptopFactory laptop_factory = new LaptopFactory();

        Laptop laptopx = laptop_factory.getLaptop("LenovoLegion",new razerViperMini(),new HyperX_alloy());
        Laptop laptopy = laptop_factory.getLaptop("AsusGStrix", new logitechG502(), new Corsair());
        Laptop laptopz = laptop_factory.getLaptop("AcerPredator", new logitechG502(), new Corsair());
        // Laptop laptopzz = laptop_factory.getLaptop("AsusGStrix");

        // Laptop laptop1 = new Asus_gStrix(new razerViperMini(),new HyperX_alloy());
        // Laptop laptop2 = new Lenovo_Legion(new logitechG502(), new Corsair());

        //laptop1.connectMouse();
        //laptop2.connectMouse();

        //laptop1.connectKeyboard();
        //laptop2.connectKeyboard();

        laptopx.detect();
        laptopx.connectMouse();
        laptopx.connectKeyboard();
        System.out.println();

        laptopy.detect();
        laptopy.connectMouse();
        laptopy.connectKeyboard();
        System.out.println();

        laptopz.detect();
        laptopz.connectMouse();
        laptopz.connectKeyboard();
        System.out.println();

        //laptopzz.detect();
        System.out.println();
    }

}
