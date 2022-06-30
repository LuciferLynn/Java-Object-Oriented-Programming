package designPattern_factory_2;

public class BMW_request extends Vehicle {

    private String model;
    private String engine;
    private int enginePower;

    private String manufacturer = "BMW";

    BMW_request() {

    }

    BMW_request(String model, String engine, int enginePower) {
        System.out.println("Vehicle class called");
        System.out.println("BMW_request called");
        this.model = model;
        this.engine = engine;
        this.enginePower = enginePower;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public int getEnginePower() {
        return this.enginePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "BMW_request{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", enginePower=" + enginePower +
                "} successfully requested";
    }

}
