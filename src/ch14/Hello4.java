package ch14;

public class Hello4 implements Runnable {

    String name;
    Boolean isStop;

    public Hello4(String n) {
        name = n;
        isStop = false;
    }

    public void run() {
        int i = 0;

        while (!isStop) {
            i++;
            System.out.println(name + " Hello " + i);
        }
    }

    public void stop() {
        isStop = true;
    }
}