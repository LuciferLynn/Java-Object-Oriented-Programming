package class4;

public class ArrayPlayground {

    public static void main(String[] args) {

        double numbers[] = new double[] {0.5,1.5,2.5,3.5,4.5,5.5,6.5,7.5,8.5,9.5};
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 0.5;
        }

        System.out.println("Ref1: " + numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((int)numbers[i] + " ");
        }

        System.out.println();

        reverseV4(numbers);

        System.out.println("Ref3: " + numbers);
        for (double i : numbers) {
            System.out.print((int) i + " ");
        }

        for (double each: numbers) {
            System.out.println(each);
        }

    }


    public static void reverseV4(double array[]) {

        System.out.println("Using Version4");

        for (int i = 0; i < array.length / 2; i++) {
            double temp3 = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp3;
        }

    }


    public static void reverseV3(double array[]) {

        System.out.println("V3");

        double temp[] = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - i - 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }


    public static void reverseV2(double array[]) {

        System.out.println("Version2");

        double temp[] = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - i - 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }

    }



    // The version1 does not work.
    public static void reverseV1(double array[]) {

        System.out.println("Using Version1");

        double temp[] = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - i - 1];
        }

        System.out.println("Ref1.5: " + array);
        System.out.println("Ref.temp: " + temp);
        array = temp;
        System.out.println("Ref.temp: " + temp);
        System.out.println("Ref2: " + array);

    }

}
