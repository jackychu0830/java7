package ch14;


public class Hello1 extends Thread {

    String name;

    public Hello1(String n) {
        name = n;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " Hello " + i);
            Thread.yield();
        }
    }
}