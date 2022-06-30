package ___FinalProject;

public class gamingMouse implements _Mouse{

    private String model;
    private String specialFeature = "gaming";
    private int dpi = 800; // minimum dpi = 200 and highest dpi capped at 16000, default = 800

    public gamingMouse(String model, String specialFeature) {
        this.model = model;
        this.specialFeature = specialFeature;
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
        System.out.println("Mouse 4 on " + model + " pressed");
        if (dpi >= 200 + 200) {
            dpi -= 200;
            System.out.println("dpi has been reduced to " + dpi);
        } else {
            System.out.println("Minimum dpi reached!");
            System.out.println("dpi cannot be further decreased");
        }
    }

    @Override
    public void mouse5pressed() {
        System.out.println("Mouse 5 on " + model + " pressed");
        if (dpi <= 16000 - 200) {
            dpi += 200;
            System.out.println("dpi has been increased to " + dpi);
        } else {
            System.out.println("Maximum dpi reached!");
            System.out.println("dpi cannot be further increased");
        }
    }

    @Override
    public String toString() {
        return "gamingMouse{" +
                "model='" + model + '\'' +
                ", specialFeature='" + specialFeature + '\'' +
                '}';
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

}
