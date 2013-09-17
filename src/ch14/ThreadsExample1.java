package ch14;

public class ThreadsExample1 {

    public static void main(String argv[]) {
        Hello1 h1 = new Hello1("Thread1");
        Hello2 h2 = new Hello2("Thread2");

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
    }
}