package ___FinalProject;

public class Keyboard implements _Keyboard{

    private String model;

    public Keyboard(String model) {
        this.model = model;
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
        System.out.println("Special assigned keys not supported on " + model + " keyboard");
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "model='" + model + '\'' +
                '}';
    }
}
