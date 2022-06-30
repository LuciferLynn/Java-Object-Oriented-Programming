package codingbat_JavaLogic2;

public class makeBricks {

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 2, 9));
    }

    public static boolean makeBricks(int small, int big, int goal) {

        while (big>0 && goal>=5) {
            goal -= 5;
            big -= 1;
        }

        if (goal <= small) {
            return true;
        }
        return false;
    }

    public static boolean makeBricksV2(int small, int big, int goal) {
        int temp = goal / 5;

        if (big >= temp) {
            big = temp;
        }

        if (goal - 5*big <= small) {
            return true;
        }

        return false;
    }

}
