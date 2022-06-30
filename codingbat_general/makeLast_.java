package codingbat;

import java.util.Arrays;

public class makeLast_ {

    public static void main(String[] args) {

        int[] a1 = {4,5,6};
        System.out.println(Arrays.toString(makeLast(a1)));

    }

    public static int[] makeLast(int[] nums) {
        int[] out = new int[nums.length*2];
        out[(out.length)-1] = nums[(nums.length)-1];
        return out;
    }


}
