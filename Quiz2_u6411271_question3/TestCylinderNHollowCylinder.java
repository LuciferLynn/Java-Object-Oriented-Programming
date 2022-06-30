package u6411271_question3;

public class TestCylinderNHollowCylinder {
    public static void main(String[] args) {

        Circle cylinder1 = new Cylinder(2.0,5.0,"green");
        HollowCylinder h_cylinder1 = new HollowCylinder(10.0, 5.0, 2.0, "pink");

        System.out.println("cylinder1 = " + cylinder1.toString());
        System.out.println("h_cylinder1 = " + h_cylinder1.toString());

        System.out.println("cylinder1 Volume = " + cylinder1.getVolume());
        System.out.println("h_cylinder1 Volume = " + h_cylinder1.getVolume());

    }
}
