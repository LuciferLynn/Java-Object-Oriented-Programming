package ___FinalProject;

public interface _Setup {

    abstract void turnLaptopOn();
    abstract void turnLaptopOff();

    abstract void connectKeyboard();
    abstract void connectMouse();

    abstract void disconnectKeyboard();
    abstract void disconnectMouse();

    abstract void pressMouse4();
    abstract void pressMouse5();

    abstract void pressKeyboardSpecial();

    abstract int getMouseDpi();

    abstract String setupFeedback();

    abstract void overclock(int n);

    abstract String getPurpose();
    abstract _Mouse getMouse();
    abstract _Keyboard getKeyboard();

    abstract void setPurpose(String purpose);
    abstract void setMouse(_Mouse mouse);
    abstract void setKeyboard(_Keyboard keyboard);


}
