package ___FinalProject;

public class gamingKeyboard implements  _Keyboard{

    private String model;
    private String specialFeature = "gaming";
    private boolean dnd = false;

    public gamingKeyboard(String model, String specialFeature) {
        this.model = model;
        this.specialFeature = specialFeature;
    }

    @Override
    public void connectKeyboard() {
        System.out.println(model + " keyboard has been connected");
    }

    @Override
    public void disconnectKeyboard() {
        System.out.println(model + " keyboard has been disconnected");
    }

    @Override
    public void specialKey() {
        System.out.println("Special key pressed on " + model + " keyboard");
        System.out.println("Do not Disturb: On");
        dnd = true;
    }

    @Override
    public String toString() {
        return "gamingKeyboard{" +
                "model='" + model + '\'' +
                ", specialFeature='" + specialFeature + '\'' +
                '}';
    }
}
