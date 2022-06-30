package class3;

public class PrimitiveDataType {

    /**
     * Exercise 1: Passing primitive data type to a function
     */

    public static void main(String[] args) {

        String name = "Fair"; /* Example of primitive data type */
        int num = 1234; /* Example of primitive data type */

        setNewValueStr(name);
        setNewValueInt(num);

        System.out.println(name);
        System.out.println(num);

        /* Passed-by-value will not affect the original variable's value */

    }

    public static void setNewValueStr(String str) {
        str = "Whatever";
        System.out.println("String: " + str);
    }

    public static void setNewValueInt(int number) {
        number = 1;
        System.out.println("Integer: " + number);
    }

}
