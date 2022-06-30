package class3;

public class Exercise3 {

    public static void main(String[] args) {

        int studentIDs [] = new int[100]; // declare array with 100 empty spaces
        studentIDs[0] = 1000;
        studentIDs[1] = 1001;
        studentIDs[2] = 1002;
        studentIDs[3] = 1003;
        studentIDs[4] = 1004;

        System.out.println(studentIDs); // reference will be printed out
        System.out.println(studentIDs[0]);

        resetArrayInt(studentIDs); // call reset function

        System.out.println(studentIDs); // reference will be printed out
        System.out.println(studentIDs[0]);
    }

    public static void resetArrayInt(int numbers[]) {
        System.out.println(numbers); // reference will be printed out
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
    }

}
