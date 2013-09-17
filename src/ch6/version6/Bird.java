package ch6.version6;

public class Bird extends Animal {

    public Bird() {
        setLegs(4);
        setKind("Bird");
    }

    public void move() {
        System.out.println("Flying");
    }
}