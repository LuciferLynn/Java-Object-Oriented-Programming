package designPattern_factory_2;

public class Suzuki extends Suzuki_request{

    Suzuki() {

    }

    Suzuki(String model, String engine, int enginePower) {
        super(model, engine, enginePower);
        System.out.println(super.toString());
    }

    public boolean inspect() { // engines for Suzuki must be at least 5 to pass inspection
        if(this.getEnginePower()>=5) {
            return true;
        } else {
            return false;
        }
    }

    public String create() { // final result (to create or reject) after inspection
        if (this.inspect() == true) {
            return ("Suzuki{" +
                    "manufacturer='" + this.getManufacturer() + '\'' +
                    ", model='" + this.getModel() + '\'' +
                    ", engine='" + this.getEngine() + '\'' +
                    ", enginePower=" + this.getEnginePower() +
                    "} successfully created");
        } else {
            System.out.println("Engine power of " + this.getEnginePower() + " detected");
            System.out.println("Defect in engine power detected");
            System.out.println("This is a defect, the Suzuki will not be created");
            System.out.println("Engine has been removed for inspection");
            System.out.println("Engine power has been set to 0");
            this.setEnginePower(0);
            this.setEngine(null);
           return ("Suzuki{" +
                    "manufacturer='" + this.getManufacturer() + '\'' +
                    ", model='" + this.getModel() + '\'' +
                    ", engine='" + this.getEngine() + '\'' +
                    ", enginePower=" + this.getEnginePower() +
                    "} is left and has been rejected");
        }
    }

    @Override
    public String toString() {
        return this.create();
    }
}
