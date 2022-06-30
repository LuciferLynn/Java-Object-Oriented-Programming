package ___FinalProject;

public class Mouse implements _Mouse{

    private String model;
    private int dpi = 800;

    public Mouse(String model) {
        this.model = model;
    }

    @Override
    public void connectMouse() {
        System.out.println(model + " mouse has been connected");
    }

    @Override
    public void disconnectMouse() {
        System.out.println(model + " mouse has been disconnected");
    }

    @Override
    public int getDPI() {
        return dpi;
    }

    @Override
    public void mouse4pressed() {
        System.out.println("Mouse 4 not supported on " + model + " mouse!");
    }

    @Override
    public void mouse5pressed() {
        System.out.println("Mouse 5 not supported on " + model + " mouse!");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "model='" + model + '\'' +
                '}';
    }
}
