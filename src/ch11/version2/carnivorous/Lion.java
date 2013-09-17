package ch11.version2.carnivorous;

public class Lion extends ch11.version2.zoo.Animal {

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