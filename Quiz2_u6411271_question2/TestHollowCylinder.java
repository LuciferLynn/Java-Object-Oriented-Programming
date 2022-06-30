package u6411271_question2;

public class TestHollowCylinder {
    public static void main(String[] args) {

        HollowCylinder hollowcylinder1 = new HollowCylinder();
        HollowCylinder hollowcylinder2 = new HollowCylinder(3.0, 2.0, 5.0,"cyan");

        System.out.println("hollowcylinder1 = " + hollowcylinder1.toString());
        System.out.println("hollowcylinder2 = " + hollowcylinder2.toString());

        System.out.println("hollowcylinder1 volume = " + hollowcylinder1.getVolume());
        System.out.println("hollowcylinder2 volume = " + hollowcylinder2.getVolume());

    }
}
