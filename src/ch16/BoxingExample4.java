package ch16;

import static java.lang.System.*;

public class BoxingExample4 {

    public static void main(String[] args) {
        float f = 10F;
        Integer i = 20;
        Float j = f > i ? f : i;

        Integer i2 = j.intValue();
        switch (i2) {
            case 10:
                out.println("Hello");
            case 20:
                out.println("World");
        }
    }
}
