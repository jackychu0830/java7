package ch6.version6;

public class Ostrich extends Bird {

    public Ostrich() {
        setLegs(2);
        setKind("Ostrich");
    }

    public void move() {
        System.out.println("Running");
    }

    public void hideHead() {
        System.out.println("Hidding the head...");
    }
}