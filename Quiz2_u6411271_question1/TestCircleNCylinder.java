package u6411271_question1;

public class TestCircleNCylinder {

    public static void main(String[] args) {

        Circle circle1 = new Circle (3);
        System.out.println(circle1.toString());
        System.out.println(circle1.getArea());
        System.out.println();

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(4.0);
        Cylinder cylinder3 = new Cylinder(4.0,5.0);
        Cylinder cylinder4 = new Cylinder(4.0,5.0,"green");

        System.out.println("cylinder1 = " + cylinder1.toString());
        System.out.println("cylinder2 = " + cylinder2.toString());
        System.out.println("cylinder3 = " + cylinder3.toString());
        System.out.println("cylinder4 = " + cylinder4.toString());

        System.out.println();

        System.out.println("cylinder1 volume = " + cylinder1.getVolume());
        System.out.println("cylinder4 volume = " + cylinder4.getVolume());

        System.out.println();

        // the base of the cylinder is a circle
        // the cylinder1.getArea will return the area of the circle which is the base of cylinder1

        System.out.println("cylinder1 base area = " + cylinder1.getArea());
        System.out.println("cylinder4 base area = " + cylinder4.getArea());

    }

}
