package __FinalProject;

public class Asus_gStrix extends Laptop{

    public Asus_gStrix() {

    }

    public Asus_gStrix(Mouse mouse) {
        super(mouse);
    }

    public Asus_gStrix(Keyboard keyboard) {
        super(keyboard);
    }

    public Asus_gStrix(Mouse mouse, Keyboard keyboard) {
        super(mouse, keyboard);
    }

    @Override
    public void detect() {
        System.out.println("Laptop Asus G-Strix detected");
    }

    @Override
    public void connectMouse() {
        System.out.print("Laptop Asus G-Strix now connected with a ");
        mouse.connectMouse();
    }

    @Override
    public void connectKeyboard() {
        System.out.print("Laptop Asus G-Strix now connected with a ");
        keyboard.connectKeyboard();
    }

}
