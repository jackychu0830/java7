package ch14;

public class Cooking {

    public static void main(String argv[]) {
        Thread mother = new Thread(new MotherThread());
        mother.start();
    }
}