package ch11.version2.birds;

public class Bird extends ch11.version2.zoo.Animal {

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