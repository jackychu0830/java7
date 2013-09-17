package ch6.version5;

public class Zoo {

    public static void main(String argv[]) {
        Lion lion = new Lion();
        Bird bird = new Bird();
        Fish fish = new Fish();

        System.out.println(lion.getKind() + " has " + lion.getLegs() + " legs.");
        System.out.println(bird.getKind() + " has " + bird.getLegs() + " legs.");
        System.out.println(fish.getKind() + " has " + fish.getLegs() + " legs.");
    }
}