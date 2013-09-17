package ch7.version1.zoo;

public class Zoo {

    public static void main(String argv[]) {
        ch7.version1.zoo.birds.Ostrich ostrich = new ch7.version1.zoo.birds.Ostrich();

        ostrich.move();
        ((ch7.version1.zoo.birds.Bird) ostrich).move();
        ((Animal) ostrich).move();
    }
}