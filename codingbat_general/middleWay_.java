package codingbat;

import java.util.Arrays;

public class middleWay_ {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1, 1};
        int[]array2 = {4, 5, 6, 1, 1};
        System.out.println(Arrays.toString(middleWay(array1, array2)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] out = new int[2];
        out[0] = a[(a.length+1)/2];
        out[1] = b[(b.length+1)/2];
        return out;
    }

}
