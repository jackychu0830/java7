package ch7.version2.zoo;

import ch7.version2.zoo.birds.Bird;
import ch7.version2.zoo.birds.Ostrich;

public class Zoo {

    public static void main(String argv[]) {
        Ostrich ostrich = new Ostrich();

        ostrich.move();
        ((Bird) ostrich).move();
        ((Animal) ostrich).move();
    }
}