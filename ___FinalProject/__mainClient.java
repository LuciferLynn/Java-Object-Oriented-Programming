package ___FinalProject;

import java.security.Key;

public class __mainClient {
    public static void main(String[] args) {
        System.out.println();

        _setupFactory setupFactory = new _setupFactory();

        _Setup gamingSetupX = setupFactory.getSetup("gaming",
                new _Laptop("Asus Strix"),
                new gamingMouse("Razer","High responsiveness"),
                new gamingKeyboard("Corsair", "customizable macros")
        );

        System.out.println(gamingSetupX.setupFeedback());
        System.out.println();

        // Test gaming mouse customizable dpi settings
        //  mouse4
        gamingSetupX.pressMouse4();
        gamingSetupX.pressMouse4();
        gamingSetupX.pressMouse4();
        gamingSetupX.pressMouse4();
        System.out.println(gamingSetupX.getMouseDpi()); // test getter
        //  mouse5
        gamingSetupX.pressMouse5();
        gamingSetupX.pressMouse5();
        gamingSetupX.pressMouse5();
        gamingSetupX.pressMouse5();
        for (int i = 0; i < 76; i++) {
            gamingSetupX.pressMouse5(); // increase dpi until it reaches more than maximum and see result
        }
        System.out.println(gamingSetupX.getMouseDpi()); // test getter
        System.out.println();


        _Setup SetupY = setupFactory.getSetup("",
                new _Laptop("Ascer"),
                new Mouse("Logitech"),
                new Keyboard("Antech")
        );

        System.out.println(SetupY.setupFeedback());
        System.out.println();

        // Test mouse customizable dpi settings
        //  mouse4
        SetupY.pressMouse5();
        // mouse5
        SetupY.pressMouse4();
        System.out.println();

        // test keyboard special key (gaming keyboard and normal keyboard)
        gamingSetupX.pressKeyboardSpecial(); // for gaming keyboard
        SetupY.pressKeyboardSpecial(); // for normal keyboard

        System.out.println();

        //
        // TESTING OTHER METHODS IN SETUPX
        // Test all other methods for setupX
        gamingSetupX.turnLaptopOn();
        gamingSetupX.connectMouse();
        gamingSetupX.connectKeyboard();
        gamingSetupX.disconnectMouse();
        gamingSetupX.disconnectKeyboard();
        gamingSetupX.turnLaptopOff();
        //  testing overclock feature for setupX
        gamingSetupX.overclock(40);
        gamingSetupX.overclock(20);
        gamingSetupX.overclock(20);
        //  testing purpose editor
        System.out.println("Purpose of this setup: "+gamingSetupX.getPurpose());
        gamingSetupX.setPurpose("High performance and Overclock Setup for LynnThit");
        System.out.println("Purpose of this setup: "+gamingSetupX.getPurpose());
        //  testing mouse getter and setter for changing the mouse in setupX
        System.out.println("Old mouse: "+gamingSetupX.getMouse());
        gamingSetupX.setMouse(new gamingMouse("Steelseries", "lightweight and customizable weights"));
        System.out.println("New mouse: "+gamingSetupX.getMouse());
        // testing keyboard getter and setter for editing the keyboard used in a created productivity setupX
        System.out.println("Old keyboard: "+gamingSetupX.getKeyboard());
        gamingSetupX.setKeyboard(new gamingKeyboard("Steelseries", "tactile and responsive"));
        System.out.println("New keyboard: "+gamingSetupX.getKeyboard());
        //  display new setupX details after the changes
        System.out.println("New setup: " + gamingSetupX.setupFeedback() + "\n");
        System.out.println();

        //
        // TESTING OTHER METHODS IN SETUPY
        // Test all other methods for setupY
        SetupY.turnLaptopOn();
        SetupY.connectMouse();
        SetupY.connectKeyboard();
        SetupY.disconnectMouse();
        SetupY.disconnectKeyboard();
        SetupY.turnLaptopOff();
        //  testing overclock feature for setupY
        SetupY.overclock(20);
        SetupY.overclock(21);
        //  testing purpose editor
        System.out.println("Purpose of this setup: "+SetupY.getPurpose());
        SetupY.setPurpose("For college and studies");
        System.out.println("Purpose of this setup: "+SetupY.getPurpose());
        //  testing mouse getter and setter for changing the mouse in setupY
        System.out.println("Old mouse: "+SetupY.getMouse());
        SetupY.setMouse(new Mouse("abc"));
        System.out.println("New mouse: "+SetupY.getMouse());
        // testing keyboard getter and setter for editing the keyboard used in a created productivity setupY
        System.out.println("Old keyboard: "+SetupY.getKeyboard());
        SetupY.setKeyboard(new Keyboard("xyz"));
        System.out.println("New keyboard: "+SetupY.getKeyboard());
        //  display new setupY details after the changes
        System.out.println("New setup: " + SetupY.setupFeedback() + "\n");
        System.out.println();

        // Test prebuilt setup in setupFactory
        _Setup razerSetup = setupFactory.getPrebuiltSetup("razer");
        System.out.println(razerSetup.setupFeedback());

    }
}
