package ch6.version8;

public class Lion extends Animal {

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