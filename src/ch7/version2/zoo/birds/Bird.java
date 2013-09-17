package ch7.version2.zoo.birds;

import ch7.version2.zoo.Animal;

public class Bird extends Animal {

    static private int count;

    public Bird() {
        setLegs(4);
        setKind("Bird");
        count++;
    }

    public void move() {
        System.out.println("Flying");
    }

    static public int getCount() {
        return count;
    }
}