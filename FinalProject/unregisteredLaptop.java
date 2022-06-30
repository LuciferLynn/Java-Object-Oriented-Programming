package __FinalProject;

public class unregisteredLaptop extends Laptop{

    public unregisteredLaptop() {

    }

    public unregisteredLaptop(Mouse mouse) {
        super(mouse);
    }

    public unregisteredLaptop(Keyboard keyboard) {
        super(keyboard);
    }

    public unregisteredLaptop(Mouse mouse, Keyboard keyboard) {
        super(mouse, keyboard);
    }

    @Override
    public void detect() {
        System.out.println("Unregistered laptop detected");
    }

    @Override
    public void connectMouse() {
        System.out.print("The unregistered laptop is now connected with a ");
        mouse.connectMouse();
    }

    @Override
    public void connectKeyboard() {
        System.out.print("The unregistered laptop is now connected with a ");
        keyboard.connectKeyboard();
    }
}
