package ch16;

import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.out;

public class StaticImportExample3 {

    public static void main(String[] args) {
        int i1 = 100;
        long i2 = 200L;

        out.printf("The max value is %d.%n", MAX_VALUE);
        out.printf("100 hex format is %s%n", toHexString(i1));
        out.printf("200 hex format is %s%n", toHexString(i2));
    }
}
