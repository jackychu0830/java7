package ch6.version4;

public class Zoo {

    public static void main(String argv[]) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal(10);

        animal1.setLegs(3);
        animal2.setLegs(2);

        System.out.println("animal1 has " + animal1.getLegs() + " legs.");
        System.out.println("animal2 has " + animal2.getLegs() + " legs.");
        System.out.println("animal3 has " + animal3.getLegs() + " legs.");
    }
}