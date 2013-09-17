package ch7.version1.zoo.carnivorous;

public class Lion extends ch7.version1.zoo.Animal {

    static private int count;

    public Lion() {
        setLegs(4);
        setKind("Lion");
        count++;
    }

    static public int getCount() {
        return count;
    }
}