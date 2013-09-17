package ch14;

public class Hello2 implements Runnable {

    String name;

    public Hello2(String n) {
        name = n;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " Hello " + i);
        }
    }
}