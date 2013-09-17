package ch16;

import static java.lang.System.*;

public class VarargsExample {

    public static void main(String[] args) {
        out.println("none = " + sum());
        out.println("1 + 2 + 3 = " + sum(1, 2, 3));
        out.println("1 + 2 + 3 + 4 + 5 = " + sum(1, 2, 3, 4, 5));
    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return sum;
    }
}
