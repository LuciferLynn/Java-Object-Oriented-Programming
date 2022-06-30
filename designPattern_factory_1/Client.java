package designPattern_factory_1;

public class Client {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("s");
        shape1.setName("Square #1");

        Shape shape2 = factory.getShape("r");
        shape2.setName("Rectangle #1");

        Shape shape3 = factory.getShape("c");
        shape3.setName("Circle #1");

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }

}
