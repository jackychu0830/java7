package ch6.version6;

public class Zoo {

    public static void main(String argv[]) {
        Animal animal = new Ostrich();

        System.out.println(animal.getKind() + " has " + animal.getLegs() + " legs.");
        animal.move();
        //animal.hideHead(); //無法直接呼叫子類別的方法
        ((Ostrich) animal).hideHead(); //需先轉型成 Ostrich 類別

        Bird bird = new Bird();
        System.out.println(bird instanceof Ostrich);
        //System.out.println(bird instanceof Fish);
    }
}