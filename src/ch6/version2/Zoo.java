package ch6.version2;

public class Zoo {

    public static void main(String argv[]) {
        Animal animal1 = new Animal(4);
        Animal animal2 = new Animal(2);

        System.out.println("animal1 has " + animal1.legs + " legs.");
        System.out.println("animal2 has " + animal2.legs + " legs.");
        animal1.eat();
        animal2.move();
    }
}