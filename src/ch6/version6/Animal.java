package ch6.version6;

public class Animal {

    private int legs;
    private String kind;

    public Animal() {
        setLegs(4);
    }

    public Animal(int l) {
        setLegs(l);
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void move() {
        System.out.println("Moving");
    }

    public void setLegs(int l) {
        if (l != 0 && l != 2 && l != 4) {
            System.out.println("Wrong number of legs!");
            return;
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
}