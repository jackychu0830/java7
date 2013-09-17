package ch16;

import static java.lang.System.*;

public class BoxingExample3 {

    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        Boolean ans = i1 == i2;
        out.printf("%d == %d? %b\n", i1, i2, ans);

        i1 = 1000;
        i2 = 1000;
        ans = i1 == i2;
        out.printf("%d == %d? %b\n", i1, i2, ans);
    }
}
