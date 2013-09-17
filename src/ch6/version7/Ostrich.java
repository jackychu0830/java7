package ch6.version7;

import ch6.version5.Bird;

public class Ostrich extends Bird {

    static private int count;

    public Ostrich() {
        setLegs(2);
        setKind("Ostrich");
        count++;
    }

    @Override
    public void move() {
        System.out.println("Running");
    }

    public void hideHead() {
        System.out.println("Hidding the head...");
    }

    static public int getCount() {
        return count;
    }
}