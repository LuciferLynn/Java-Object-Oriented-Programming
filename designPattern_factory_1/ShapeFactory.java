package designPattern_factory_1;

public class ShapeFactory {

    public Shape getShape(String str) {

        if (str.equals("s")) {
            return new Square();
        }
        else if (str.equals("r")) {
            return new Rectangle();
        }
        else if(str.equals("c")) {
            return new Circle();
        }
        else {
            return new Circle();
        }
    }

}
