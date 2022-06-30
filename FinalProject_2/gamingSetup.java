package ___FinalProject;

public class gamingSetup implements _Setup{

    private _Mouse mouse;
    private _Keyboard keyboard;
    private _Laptop laptop;
    private int overclockPercent = 0;

    private boolean overclockable = true;

    private String purpose = "Gaming";

    public gamingSetup(_Laptop laptop, _Mouse gamingMouse, _Keyboard gamingKeyboard) {
        this.laptop = laptop;
        this.mouse = gamingMouse;
        this.keyboard = gamingKeyboard;
    }

    @Override
    public void turnLaptopOn() {
        laptop.turnOn();
    }

    @Override
    public void turnLaptopOff() {
        laptop.turnOff();
    }

    @Override
    public void connectKeyboard() {
        keyboard.connectKeyboard();
    }

    @Override
    public void connectMouse() {
        mouse.connectMouse();
    }

    @Override
    public void disconnectKeyboard() {
        keyboard.disconnectKeyboard();
    }

    @Override
    public void disconnectMouse() {
       mouse.disconnectMouse();
    }

    @Override
    public void pressMouse4() {
        mouse.mouse4pressed();
    }

    @Override
    public void pressMouse5() {
        mouse.mouse5pressed();
    }

    @Override
    public void pressKeyboardSpecial() {
        keyboard.specialKey();
    }

    @Override
    public int getMouseDpi() {
        return mouse.getDPI();
    }

    @Override
    public String setupFeedback() {
        return "gamingSetup{\n" +
                "mouse=" + mouse +
                ",\nkeyboard=" + keyboard +
                ",\nlaptop=" + laptop +
                ",\noverclockable=" + overclockable +
                ",\npurpose='" + purpose + '\'' +
                '}';
    }

    @Override
    public void overclock(int n) {
        if (overclockable == true) {
            if (overclockPercent + n <= 20) {
                System.out.println("The setup has been overclocked by " + n + "%.");
                overclockPercent+=n;
            } else {
                System.out.println("Overclock request rejected");
                System.out.println("This setup should not be overclocked by over 20%");
                System.out.println("Current clock speed was at +" + overclockPercent + "%");
                System.out.println("This overclock request was " + n + "%.");
            }
        } else {
            System.out.println("This setup cannot be overclocked!");
        }
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public _Mouse getMouse() {
        return mouse;
    }

    public void setMouse(_Mouse mouse) {
        this.mouse = mouse;
    }

    public _Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(_Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public _Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(_Laptop laptop) {
        this.laptop = laptop;
    }

}
