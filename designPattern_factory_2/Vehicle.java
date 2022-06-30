package designPattern_factory_2;

public abstract class Vehicle {

    public abstract String getModel();
    public abstract String getEngine();
    public abstract int getEnginePower();

    @Override
    public String toString() {
        return "Model: " + this.getModel() + "\n" +
                "Engine: " + this.getEngine() + "\n" +
                "EnginePower: " + this.getEnginePower();
    }


}
