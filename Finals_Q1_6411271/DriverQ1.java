package Q1_6411271;

public class DriverQ1 {
    public static void main(String[] args) {
        Complement myInt = new AnInt(12);
        Complement myInt2 = new AnInt(20);

        // set methods are already implemented within the takeComplement method
        // no need to test for set methods if the program runs as expected
        // and if the program gives out the desired output correctly (which it does here)

        System.out.println("myInt1 before complement: " + ((AnInt)myInt).getNumber());
        myInt.takeComplement();
        System.out.println("myInt1 after complement: " + ((AnInt)myInt).getNumber());
        System.out.println("myInt1 after complement * 2 = " + 2*((AnInt)myInt).getNumber());

        System.out.println();

        System.out.println("myInt2 before complement: " + ((AnInt)myInt).getNumber());
        myInt2.takeComplement();
        System.out.println("myInt2 after complement: " + ((AnInt)myInt2).getNumber());
        System.out.println("myInt2 after complement * 2 = " + 2*((AnInt)myInt2).getNumber());

        System.out.println();

        AString str1 = new AString("abcd xyz ABCD XYZ ?!");
        System.out.println("str1 before complement: " + str1.getStr());
        str1.takeComplement();
        System.out.println("str1 after complement: " + str1.getStr());
    }
}
