package ch11.version2.aquatic;

public class Fish extends ch11.version2.zoo.Animal {

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