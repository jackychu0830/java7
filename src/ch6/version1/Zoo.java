package ch6.version1;

public class Zoo {

    public static void main(String argv[]) {
        Animal animal1 = new Animal();
        Animal animal2;
        animal2 = new Animal();

        animal1.legs = 4;

        System.out.println("animal1 has " + animal1.legs + " legs.");
        System.out.println("animal2 has " + animal2.legs + " legs.");
        animal1.eat();
        animal2.move();
    }
}