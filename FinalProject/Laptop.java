package __FinalProject;

public abstract class Laptop {

    protected Mouse mouse;
    protected Keyboard keyboard;

    public Laptop() {

    }

    public Laptop(Mouse mouse) {
        this.mouse = mouse;
    }

    public Laptop(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Laptop(Mouse mouse, Keyboard keyboard) {
        this. mouse = mouse;
        this.keyboard = keyboard;
    }

    abstract public void detect();
    abstract public void connectMouse();
    abstract public void connectKeyboard();

}
