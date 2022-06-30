package ___FinalProject;

public class _Laptop {

    private String model;

    public _Laptop(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void turnOn() {
        System.out.println("The laptop " + model + " has been turned on");
    }

    public void turnOff() {
        System.out.println("The laptop " + model + " has been turned off");
    }

    @Override
    public String toString() {
        return "_Laptop{" +
                "model='" + model + '\'' +
                '}';
    }
}
