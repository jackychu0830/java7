package ch6.version3;

public class Animal {

    public int legs;

    public Animal() {
        legs = 4;
    }

    public Animal(int l) {
        legs = l;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void move() {
        System.out.println("Moving");
    }
}