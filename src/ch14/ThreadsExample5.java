package ch14;

public class ThreadsExample5 {

    public static void main(String argv[]) {
        Storage s = new Storage(5);
        Producer p1 = new Producer("Producer1", s);
        Producer p2 = new Producer("Producer2", s);
        Consumer c1 = new Consumer("Consumer1", s);

        p1.start();
        p2.start();
        c1.start();
    }
}