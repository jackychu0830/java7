package ch11.version2.zoo;

import ch11.version2.WrongLegNumberException;

public class Animal {

    private int legs;
    private String kind;
    static private int count;

    public Animal() {
        this(4);
    }

    public Animal(int l) {
        setLegs(l);
        count++;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void move() {
        System.out.println("Moving");
    }

    public void setLegs(int l) {
        if (l != 0 && l != 2 && l != 4) {
            throw new WrongLegNumberException("Wrong number of legs!");
        }

        legs = l;
    }

    public int getLegs() {
        return legs;
    }

    public void setKind(String str) {
        kind = str;
    }

    public String getKind() {
        return kind;
    }

    static public int getCount() {
        return count;
    }
}