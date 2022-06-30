package __FinalProject;

public class Lenovo_Legion extends Laptop{

    public Lenovo_Legion() {

    }

    public Lenovo_Legion(Mouse mouse) {
        super(mouse);
    }

    public Lenovo_Legion(Keyboard keyboard) {
        super(keyboard);
    }

    public Lenovo_Legion(Mouse mouse, Keyboard keyboard) {
        super(mouse, keyboard);
    }

    @Override
    public void detect() {
        System.out.println("Laptop Lenovo Legion detected");
    }

    @Override
    public void connectMouse() {
        System.out.print("Laptop Lenovo Legion now connected with a ");
        mouse.connectMouse();
    }

    @Override
    public void connectKeyboard() {
        System.out.print("Laptop Lenovo Legion now connected with a ");
        keyboard.connectKeyboard();
    }
}
