package ch7.version1.zoo.aquatic;

public class Fish extends ch7.version1.zoo.Animal {

    static private int count;

    public Fish() {
        setLegs(0);
        setKind("Fish");
        count++;
    }

    static public int getCount() {
        return count;
    }
}