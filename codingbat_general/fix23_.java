package codingbat;

import java.util.Arrays;

public class fix23_ {

    public static void main(String[] args) {
        int[] a1 = {7,9,2,3,3,2,3,9};
        System.out.println(Arrays.toString(fix23(a1)));
    }

    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==2 && nums[i+1]==3) {
                nums[i+1] = 0;
            }
        }
        return nums;
    }

}
