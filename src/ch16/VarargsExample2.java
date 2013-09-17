package ch16;

import static java.lang.System.*;

public class VarargsExample2 {

    public static void main(String[] args) {
        int[] nums = {};
        out.println("none = " + sum(nums));
        int[] nums2 = {1, 2, 3};
        out.println("1 + 2 + 3 = " + sum(nums2));
        int[] nums3 = {1, 2, 3, 4, 5};
        out.println("1 + 2 + 3 + 4 + 5 = " + sum(nums3));
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return sum;
    }
}
