package ___FinalProject;

public class _setupFactory {

    public _Setup getSetup(String str, _Laptop laptop, _Mouse mouse, _Keyboard keyboard) {
        if (str == "gaming") {
            return new gamingSetup(laptop, mouse, keyboard);
        } // if not gaming, then prodSetup (short for productivity setup) will be created
        return new prodSetup(laptop, mouse, keyboard);

    }

    public _Setup getPrebuiltSetup(String str) {
        if (str == "razer") {
            return new gamingSetup(
                    new _Laptop("Razer Blade"),
                    new gamingMouse("Razer Viper Mini","Lightweight"),
                    new gamingKeyboard("Razer Widow","Special Macros")
            );
        }
        return new prodSetup(
                new _Laptop(null),
                new Mouse(null),
                new Keyboard(null)
        );
    }

}
