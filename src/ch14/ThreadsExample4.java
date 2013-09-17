package ch14;

public class ThreadsExample4 {

    public static void main(String argv[]) {
        SyncShareData s = new SyncShareData();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }
}