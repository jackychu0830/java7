package ch6.version8;

public class Zoo {

    public static void main(String argv[]) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Ostrich ostrich1 = new Ostrich();

        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Fish fish3 = new Fish();
        Fish fish4 = new Fish();

        Lion lion1 = new Lion();
        Lion lion2 = new Lion();

        System.out.println("Total Animal:" + Animal.getCount());
        System.out.println("Total Bird:" + Bird.getCount());
        System.out.println("Total Fish:" + Fish.getCount());
        System.out.println("Total Lion:" + Lion.getCount());
        System.out.println("Total Ostrich:" + Ostrich.getCount());
    }
}