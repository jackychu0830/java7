package ch14;

public class Hello3 implements Runnable {

    String name;

    public Hello3(String n) {
        name = n;
    }

    public void run() {
        int i = 0;

        while (true) {
            i++;
            System.out.println(name + " Hello " + i);
        }
    }
}